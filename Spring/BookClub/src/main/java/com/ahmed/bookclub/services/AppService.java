package com.ahmed.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.ahmed.bookclub.models.Book;
import com.ahmed.bookclub.models.LoginUser;
import com.ahmed.bookclub.models.User;
import com.ahmed.bookclub.repositories.BookRepository;
import com.ahmed.bookclub.repositories.UserRepository;

@Service
public class AppService {
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BookRepository bookRepo;
	
	public User register(User newUser, BindingResult result) {
		
		// Reject if email is taken (present in database)
		//check if the email of the object coming from the registration form matches any users email in the db. If the email matches, that means the email is taken!
		Optional<User> potentialUser = this.userRepo.findByEmail(newUser.getEmail());
		
		if(potentialUser.isPresent()) {
			//this means email is taken b/c it found a user that matched the email from reg form
			result.rejectValue("email", "EmailTaken", "This email is already in use. Please login!");
		}
		// Reject if password doesn't match confirmation
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "NoMatch", "Confirm password doesn't match password!");
		}
		
		// Return null if result has errors (if theres validation errors still)
		if(result.hasErrors()) {
			return null;
		}else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
			
			newUser.setPassword(hashed);
			return this.userRepo.save(newUser);
		}
	}
	
	public User login(LoginUser newLogin, BindingResult result) {
		
		// Find user in the DB by email
		Optional <User> potentialUser = this.userRepo.findByEmail(newLogin.getEmail());
		
		// Reject if NOT present
        //if the email was not found, create a custom validation error message 
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "NotFound", "This email does not exist. Create a new account.");
		}else {
			//else means they tried to login with an email that is found- which is good, but now we need to make sure the password matches. Since we used bcrypt to store passwords, we use bcrypt to check passwords
			if(!BCrypt.checkpw(newLogin.getPassword(), potentialUser.get().getPassword())) {
				// Reject if BCrypt password match fails (create a new validation error)
				result.rejectValue("password", "NoMatch", "Invalid Password!");
			}
		}
		
		// Return null if result has errors
		if(result.hasErrors()) {
			return null;
		}else {
			// Otherwise, return the user object
			return potentialUser.get();			
		}
	}
	
	public User findOneUser(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}
	
	public Book createBook(Book book) {
		return this.bookRepo.save(book);
	}
	
	public List<Book> getAllBooks() {
		return (List<Book>)this.bookRepo.findAll();
	}
	
	public Book getBookByID(Long id) {
		return this.bookRepo.findById(id).orElse(null);
	}
	
	public Book updateBook(Book book) {
		return this.bookRepo.save(book);
	}
}
