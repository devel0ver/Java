package com.ahmed.postagram.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahmed.postagram.models.LoginUser;
import com.ahmed.postagram.models.User;
import com.ahmed.postagram.services.UserService;

@Controller
public class HomeController {

	 @Autowired
     private UserService userServ;


	 //==============================
	 // Login Page
	 //==============================
	@GetMapping("/")
	public String homePage(Model model) {

		model.addAttribute("newLogin", new LoginUser());
		return "home.jsp";
	}

	@PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult result, Model model, HttpSession session) {

        // Add once service is implemented:
         User user = userServ.login(newLogin, result); //the variable user will be a user object if the validations are all good and password is correct. The User variable will be null if there are errors

        if(result.hasErrors()) {
            model.addAttribute("newUser", new User()); //the reg form still needs an empty object to bind to if we have errors and we re-render the log reg page
            return "home.jsp";
        }

        // No errors!
        // TO-DO Later: Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("loggedInUserID", user.getId());

        return "redirect:/home";
    }

	//==============================
	// Register Page
	//==============================
	@GetMapping("/signup")
	public String signup(Model model) {

		model.addAttribute("newUser", new User());
		return "signup.jsp";
	}

	@PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
            BindingResult result, Model model, HttpSession session) {

        // TO-DO Later -- call a register method in the service
    	User user = this.userServ.register(newUser, result); //pass in the user object from the from and the errors messsages (result variable) to the service to do additional logic for registration (compare password with confim password, make sure email is not duplicate, and encrypt the password if the form is valid)

        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before
            // re-rendering the page so the login form still has an empty object to bind to
            model.addAttribute("newLogin", new LoginUser());
            return "signup.jsp";
        }

        // No errors!
        // TO-DO Later: Store their ID from the DB in session,
        // in other words, log them in.
        session.setAttribute("loggedInUserID", user.getId());

        return "redirect:/";
    }

	 @RequestMapping("/logout")
	 public String logout(HttpSession session) {
		 session.invalidate();
		 return "redirect:/";
	 }

}
