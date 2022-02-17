package com.ahmed.fullstacktravel.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahmed.fullstacktravel.models.Expense;
import com.ahmed.fullstacktravel.repositories.ExpenseRepository;

@Service
public class ExpenseService {	//the service is what has access to the repository and thus the db
	// adding the Expense repository as a member variable to the service class so that this service can access the repository
	private final ExpenseRepository expenseRepo;
	
	//constructor that has the repository injected into it (dependency injection) --> initializes the Service with connection to the repository
    public ExpenseService(ExpenseRepository expenseRepo) {
    	this.expenseRepo = expenseRepo;
    }
    
  //methods that can use the repository to talk to db
  // returns all the Menu Items
  public List<Expense> allExpense() {
	  //we are using the findAll() method that the expenseRepo has access to and that returns back a list of Expense objects in an Iterable data type. We have to cast it to List<Expense> then return the results
	  return (List<Expense>)this.expenseRepo.findAll();
  }
  
  //this method to create new expense item accepts a Expense instance as an input and it will save it to the db using the repository
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
