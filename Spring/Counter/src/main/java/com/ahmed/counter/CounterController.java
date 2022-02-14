package com.ahmed.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/your_server/counter")
	public String showCount(HttpSession session, Model model) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String resetCount(HttpSession session, Model model) {
		if (session.getAttribute("count") != null) {
			session.invalidate();
		}
		return "redirect:/your_server/counter";
	}
	
	@RequestMapping("/your_server")
	public String home(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
			System.out.println(currentCount);
		}
		return "user.jsp";
	}
	
}
