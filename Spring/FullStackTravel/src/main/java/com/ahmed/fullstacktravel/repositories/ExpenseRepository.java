package com.ahmed.fullstacktravel.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ahmed.fullstacktravel.models.Expense;

@Repository	//@Repository annotation flags this interface as a repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {	//we inherited a bunch of CRUD methods that translate to sql queries under the hood from the CrudRepository Interface

}
