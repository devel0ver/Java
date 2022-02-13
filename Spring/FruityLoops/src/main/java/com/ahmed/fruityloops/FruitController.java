package com.ahmed.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	
	@RequestMapping("/")
	public String fruits(Model model) {
		
		ArrayList<Item> fruitType = new ArrayList<Item>();
		fruitType.add(new Item("Kiwi", 1.5));
		fruitType.add(new Item("Mango", 2.0));
		fruitType.add(new Item("Goji Berries", 4.0));
		fruitType.add(new Item("Guava", 1.5));
		
		model.addAttribute("items", fruitType);
		
		return "index.jsp";
	}
}
