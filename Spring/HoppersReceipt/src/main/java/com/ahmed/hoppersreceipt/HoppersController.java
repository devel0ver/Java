package com.ahmed.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HoppersController {
	@RequestMapping
	public String hooperReceipt(Model model) {
		String customerName = "Grace Hopper";
		String itemName = "Copper wire";
		double price = 5.25;
		String description = "Metal strips. Also an illustration of nanoseconds";
		String vendor = "Little Things Corner Store";
		
		model.addAttribute("name", customerName);
		model.addAttribute("item", itemName);
		model.addAttribute("price", price);
		model.addAttribute("description", description);
		model.addAttribute("vendor", vendor);
		
		return "index.jsp";
	}
}
