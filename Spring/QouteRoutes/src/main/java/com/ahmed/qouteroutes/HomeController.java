package com.ahmed.qouteroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/quotes")
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "Hello world! Welcome to the quotes application!";
	}
	
	@RequestMapping("/funny")
	public String funnyQuote() {
		return "Do I need to be liked? Absolutely not.";
	}
	@RequestMapping("/inspirational")
	public String inspirationalQuote() {
		return "Hello world! Welcome to the quotes application!";
	}
	@RequestMapping("/interesting")
	public String interestingQuote() {
		return "Hello world! Welcome to the quotes application!";
	}
}
