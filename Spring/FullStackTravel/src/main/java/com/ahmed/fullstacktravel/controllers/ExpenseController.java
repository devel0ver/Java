package com.ahmed.fullstacktravel.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ahmed.fullstacktravel.models.Expense;
import com.ahmed.fullstacktravel.services.ExpenseService;

@Controller	//@Controller annotation means that this class can return jsp files as a response and it can accept http requests 
public class ExpenseController {
	//the controller speaks to the service to access data. Controller doesn't directly access the data, it uses the service as a middle name (for modularization purposes)
	private final ExpenseService expenseService;
	
	//Initialize the constructor with the Expense Service enabled
	public ExpenseController(ExpenseService expenseService){
		this.expenseService = expenseService;
	}
	
	@RequestMapping("/expenses")
	public String home(Model model) { //Dependency injection of Model model -> this means that we are enabling this index() method to have access to the View Model class to be able to pass data to templates
		
		//create a variable called allExpenses that will store a List<Expense> and set it equal to what the service returns which is a List<Expense>
		List<Expense> allExpenses = this.expenseService.allExpense();
		
		//odel.addAttribute lets us pass data from the controller to the jsp file that we render in this method
		model.addAttribute("allExpenses", allExpenses);	//the word on the left side is what the HTML understands
		
		//send an empty MenuItem object to the form for the form to bind to
		model.addAttribute("expense", new Expense());
		
		return "index.jsp";
	}
	
	@PostMapping("/expense/create")
	public String create(@Valid @ModelAttribute("expense") Expense expenseItem, BindingResult result, Model model) {
		if(result.hasErrors()) {
			//need to pass in all expense again to the templates since we are rendering the template if there are validation errors
			List<Expense> allExpenses = this.expenseService.allExpense();
			model.addAttribute("allExpenses", allExpenses);
			return "index.jsp";
		}else {//else means there were no form errors, and we can send the menu item object from the form to the service
			this.expenseService.create(expenseItem);
			return "redirect:/expenses";			
		}
	}
	
	@RequestMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Expense expenseToEdit = this.expenseService.FindExpense(id);
		
		model.addAttribute("expenseToEdit", expenseToEdit);
		
		return "edit.jsp";
	}
	
	@PutMapping("/expense/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expenseToEdit") Expense expenseItem, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}else {
			this.expenseService.update(expenseItem);
			return "redirect:/expenses";
		}
	}
	
	@RequestMapping("/expense/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.expenseService.delete(id);
		return "redirect:/expenses";
	}
	
	@RequestMapping("/expenses/{id}")
	public String showExpense(@PathVariable("id") Long id, Model model) {
		Expense oneExpense =this.expenseService.FindExpense(id);
		
		model.addAttribute("oneExpense", oneExpense);
		return "show.jsp";
	}
	
}
