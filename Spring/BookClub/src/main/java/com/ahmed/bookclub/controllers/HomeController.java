package com.ahmed.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahmed.bookclub.models.Book;
import com.ahmed.bookclub.models.LoginUser;
import com.ahmed.bookclub.models.User;
import com.ahmed.bookclub.services.AppService;

@Controller
public class HomeController {
	@Autowired
	private AppService appServ;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index.jsp";
	}
	
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model, HttpSession session) {
		
		User user = this.appServ.register(newUser, result);
		
		if(result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser());
			return "index.jsp";
		}
		// No errors! 
        // TO-DO Later: Store their ID from the DB in session, 
        // in other words, log them in.'
		session.setAttribute("loggedInUserID", user.getId());
		return "redirect:/";
	}
	
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
		
		User user = this.appServ.login(newLogin, result);
		
		if(result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}
		session.setAttribute("loggedInUserID", user.getId());
		return "redirect:/books";
	}
	
	@RequestMapping("/books")
	public String home(Model model, HttpSession session) {
		
		Long id = (Long) session.getAttribute("loggedInUserID");
		
		if(id == null) { //if they are not logged in and trying to view the dashboard, redirect to the login reg form
			session.invalidate();
			return "redirect:/";
		}
		
		//get the user object with the id from session using the service
		User loggedInUser = this.appServ.findOneUser(id);
		
		model.addAttribute("allBooks", this.appServ.getAllBooks());
		model.addAttribute("loggedInUser", loggedInUser);
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/books/new")
	public String createBook(Model model, HttpSession session) {
		
		Long id = (Long) session.getAttribute("loggedInUserID");
		//get the user object with the id from session using the service
		if(id==null) {
			return "redirect:/";
		}
		User loggedInUser = this.appServ.findOneUser(id);
		
		model.addAttribute("user", loggedInUser);
		model.addAttribute("book", new Book());
		
		return "books.jsp";
	}
	
	@PostMapping("/books/create")
	public String bookProccess(@Valid @ModelAttribute("book") Book newBook, BindingResult result) {
		
		if(result.hasErrors()) {
			return "books.jsp";
		}else {
			this.appServ.createBook(newBook);
			return "redirect:/books";
		}
	}
	
	@RequestMapping("/books/create")
	public String backToDashboard() {
		return "redirect:/books/new";
	}
	
	@RequestMapping("/books/{id}")
	public String showBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		
		Long Id = (Long) session.getAttribute("loggedInUserID");
		//get the user object with the id from session using the service
		if(Id == null) {
			return "redirect:/";
		}
		User loggedInUser = this.appServ.findOneUser(Id);
		
		model.addAttribute("user", loggedInUser);
		
		model.addAttribute("book", this.appServ.getBookByID(id));
		
		return "showbook.jsp";
	}
	
	@RequestMapping("/books/{id}/edit")
	public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
		
		Book book = this.appServ.getBookByID(id);
		
		if(book.getUser().getId() != session.getAttribute("loggedInUserID")) { //if they are not logged in and trying to view the dashboard, redirect to the login reg form
			return "redirect:/books";
		}else {
			Book bookToEdit = this.appServ.getBookByID(id);
		
			model.addAttribute("book", bookToEdit);
		
			return "editbook.jsp";
		}
	}
	
	@PostMapping("/books/{id}/update")
	public String updateABook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book bookToEdit, BindingResult result) {
		
		if(result.hasErrors()) {
			return "editbook.jsp";
		}else {
			this.appServ.updateBook(bookToEdit);
			return "redirect:/books";			
		}
	}
	
	@RequestMapping("/books/{id}/update")
	public String backToEditBook() {
		return "redirect:/books/{id}/edit";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("/books/{id}/delete")
	public String delete(@PathVariable("id") Long id) {
		this.appServ.deleteBook(id);
		return "redirect:/books";
	}
	
	@RequestMapping("/books/{id}/borrow")
	public String borrow(@PathVariable("id") Long id, HttpSession session) {
		Book book = this.appServ.getBookByID(id);
		Long Id = (Long) session.getAttribute("loggedInUserID");
		User loggedInUser = this.appServ.findOneUser(Id);
		book.setCurrentBorrower(loggedInUser);
		this.appServ.updateBook(book);
		return "redirect:/books";
	}
	
	@RequestMapping("/books/{id}/return")
	public String returnBook(@PathVariable("id") Long id, HttpSession session) {
		Book book = this.appServ.getBookByID(id);
		book.setCurrentBorrower(null);
		this.appServ.updateBook(book);
		return "redirect:/books";
	}
	
}
