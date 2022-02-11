package com.ahmed.playerpathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	@RequestMapping("/")
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping("/sport/team/{teamName}")
	public String showTeam(@PathVariable("teamName") String teamName) {
		System.out.println(teamName);
		return String.format("This is the %s page", teamName);
	}
	
	@RequestMapping("/sport/player/{playerNumber}")
	public String showPlayerInfo(@PathVariable("playerNumber") int playerNumber) {
		if(playerNumber<0) {
			return "Player not found, try again";
		}
		if(playerNumber == 23) {
			return "This is the GOAT!!!";
		}else {
		return String.format("Info about player # %s", playerNumber);
		}
	}
}
