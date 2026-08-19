package com.kishan.service;

import java.util.List;

import com.kishan.model.Expense;

public interface IExpenseService {
	
	public Expense addExpense(Expense expense);

	public List<Expense> getAllExpenses();

	public Expense getExpenseById(Integer id);

	public Expense updateExpense(Expense expense);

	public void deleteExpense(Integer id);

}
