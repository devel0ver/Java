package com.ahmed.fullstacktravel.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahmed.fullstacktravel.models.Expense;
import com.ahmed.fullstacktravel.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	// adding the expense repository as a dependency
	private final ExpenseRepository expenseRepo;
	
	//constructor that has the repository injected into it (dependency injection) --> initializes the Service with connection to the repository
    public ExpenseService(ExpenseRepository expenseRepo) {
    	this.expenseRepo = expenseRepo;
    }
    
  //methods that can use the repository to talk to db
  // returns all the Menu Items
  public List<Expense> allExpense() {
	  return (List<Expense>)this.expenseRepo.findAll();
  }
  
  public Expense create(Expense expenseItem) {
	  return this.expenseRepo.save(expenseItem);
  }
  
  //retrieves an Expense by id
  public Expense FindExpense(Long id) {
	  return this.expenseRepo.findById(id).orElse(null);
  }
  
  //update a expense given an object
   public Expense update(Expense expenseItem) {
	   return this.expenseRepo.save(expenseItem);
   }
   
   //delete a expense by its id
   public void delete(Long id) {
	   this.expenseRepo.deleteById(id);
   }
}
