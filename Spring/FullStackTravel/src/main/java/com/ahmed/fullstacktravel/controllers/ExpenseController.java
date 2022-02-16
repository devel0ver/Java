package com.ahmed.fullstacktravel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahmed.fullstacktravel.models.Expense;
import com.ahmed.fullstacktravel.services.ExpenseService;

@Controller
public class ExpenseController {
	private final ExpenseService expenseService;
	
	public ExpenseController(ExpenseService expenseService){
		this.expenseService = expenseService;
	}
	
	@RequestMapping("/expenses")
	public String home(Model model) {
		
		List<Expense> allExpenses = this.expenseService.allExpense();
		
		model.addAttribute("allExpenses", allExpenses);
		//send an empty MenuItem object to the form for the form to bind to
		model.addAttribute("expense", new Expense());
		return "index.jsp";
	}
	
	@PostMapping("/expense/create")
	public String create(@Valid @ModelAttribute("expense") Expense expenseItem, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Expense> allExpenses = this.expenseService.allExpense();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		}else {
			this.expenseService.create(expenseItem);
			return "redirect:/expenses";			
		}
	}
}
