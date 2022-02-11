package com.ahmed.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@RequestMapping("/")
	public String helloHuman(@RequestParam(value="name", required=false) String name, @RequestParam(value="times", required=false) Integer times, @RequestParam(value="last_name", required=false) String lastName) {
		if(name == null && lastName == null && times == null) {
			return "Hello Human";
		}else if(lastName == null && times == null) {
			return String.format("Hello %s", name);
		}else if(lastName == null && times > 0) {
			return String.format("Hello %s", name).repeat(times);
		}else if(times == null) {
			return String.format("Hello %s %s", name, lastName);
		}else if (times > 0) {
			return String.format("Hello %s %s", name, lastName).repeat(times);
		}else {
			return "Try again";
		}
		
		//think about 
		
		//message ""
		//first name and lastname make up that string
		//whatif no times? you still want to display string ONCE
		//if there is time loop as many times as you need 
	}
}
