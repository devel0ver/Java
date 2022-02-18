package com.ahmed.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahmed.dojosninjas.models.Dojo;
import com.ahmed.dojosninjas.models.Ninja;
import com.ahmed.dojosninjas.services.DojoNinjaService;

@Controller
public class DojoNinjaController {
	private final DojoNinjaService dojoNinjaService;
	
	public DojoNinjaController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}
	
	@RequestMapping("/dojos/new")
	public String createDojo(Model model) {
		
		model.addAttribute("dojo", new Dojo());	
		return "addDojo.jsp";
	}
	
	@PostMapping("/dojo/create")
	public String createTeamProcess(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		
		if(result.hasErrors()) {
			return "addDojo.jsp";
		}else {
			this.dojoNinjaService.createDojo(dojo);
			return "redirect:/dojos/new";			
		}
	}
	
	@GetMapping("/ninja/new")
	public String createNinja(Model model) {
		
		model.addAttribute("allDojos", this.dojoNinjaService.allDojos());
		
		model.addAttribute("ninja", new Ninja());
		
		return "addninja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinjaProcess(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("allDojos", this.dojoNinjaService.allDojos());
			return "addninja.jsp";
		}else {
			this.dojoNinjaService.createNinja(ninja);
			return "redirect:/ninja/new";			
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojoDetails(@PathVariable("id") Long id, Model model) {
		
		Dojo dojoToShow = this.dojoNinjaService.getOneDojo(id);
		
		model.addAttribute("dojoToShow", dojoToShow);
		
		return "showdojo.jsp";
	}
}
