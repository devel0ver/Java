package com.ahmed.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/omikuji")
	public String home() {
		return "index.jsp";
	}
	
	@PostMapping("/omikuji/process")
	public String process(@RequestParam("num") Integer num,
			@RequestParam("city") String city,
			@RequestParam("real_name") String real_name,
			@RequestParam("hobby") String hobby,
			@RequestParam("living_thing") String living_thing,
			@RequestParam("comment") String comment,
			HttpSession session
			) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("real_name", real_name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living_thing", living_thing);
		session.setAttribute("comment", comment);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String show() {
		return "show.jsp";
	}
}
