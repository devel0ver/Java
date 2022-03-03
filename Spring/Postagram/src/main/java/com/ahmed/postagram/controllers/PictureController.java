package com.ahmed.postagram.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ahmed.postagram.models.Picture;
import com.ahmed.postagram.models.User;
import com.ahmed.postagram.models.UserLike;
import com.ahmed.postagram.services.PictureService;
import com.ahmed.postagram.services.UserService;

@Controller
public class PictureController {
	 @Autowired
     private UserService userServ;
	 
	 @Autowired
	 private PictureService picServ;
	 
	 private String UPLOADED_FOLDER="src/main/resources/static/images/";

	@RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    		Long id = (Long) session.getAttribute("loggedInUserID"); //this gives the id of the user stored in session (logged in user's id)    		
	    		
    		if(id == null) { //if they are not logged in and trying to view the dashboard, redirect to the login reg form
    			return "redirect:/";
    		}
    		//get the user object with the id from session using the service
    		User loggedInUser = this.userServ.findOneUser(id);
    		model.addAttribute("loggedInUser", loggedInUser);
    		
    		model.addAttribute("allUsers", this.userServ.allUsers());
    		
    		return "dashboard.jsp";
    }
	
	@PostMapping("/home/upload")
	public String uploadPic(@RequestParam("pic") MultipartFile file, @RequestParam("description") String desc, HttpSession session, RedirectAttributes redirectAttributes) {
		
		Long id = (Long)session.getAttribute("loggedInUserID");
		User user = this.userServ.findOneUser(id);
		
		if(file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Choose a file file to upload!");
			return "redirect:/home";
		}
		try {
			//these upload the file to our project's static folder + path we specify
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			
			//this is going to make a record in our DB about the location of the uploaded file and its description
			String url = "/images/" + file.getOriginalFilename();
			
			//we need to send information to the picture service to create a new picture. We need to include the uploader(logged in user), image_url and description(from the form
			this.picServ.uploadPic(user, url, desc);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		return "redirect:/home";
	}
	
	@PostMapping("/post/like/{id}")
	public String likePost(@PathVariable("id") Long id, HttpSession session, Model model) {
		Picture currentPic = picServ.findOnePic(id);
		
		Long Id = (Long)session.getAttribute("loggedInUserID");
		User currentUser = userServ.findOneUser(Id);
		
//		model.addAttribute("newLike", new UserLike());
		
		System.out.println("This is currentUser: " + currentUser);
		System.out.println("This is currentPic: " + currentPic);
		
		
		UserLike like = new UserLike();
		
		List<UserLike> users = currentUser.getUserWhoLikedPic();
		
		System.out.println("This is users: " + users);
		
		users.add(users);
		System.out.println("This is users after add: " + users);
		
		
		currentPic.setPictureLiked(users);
		
		return "";
	}
	
	@GetMapping("/home/user/{id}")
	public String showUserPage(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("userToShow", this.userServ.findOneUser(id));
		
		return "userprofile.jsp";
	}
	
}
