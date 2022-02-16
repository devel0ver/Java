package com.ahmed.fullstacktravel.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ahmed.fullstacktravel.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {

}
