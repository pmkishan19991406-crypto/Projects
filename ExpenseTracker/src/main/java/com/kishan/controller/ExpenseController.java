package com.kishan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kishan.model.Expense;
import com.kishan.service.IExpenseService;

@RestController
public class ExpenseController {

    @Autowired
    private IExpenseService eservice;


    @PostMapping("/api/expenses")
    public Expense addExpense(
            @RequestBody Expense expense) {

        return eservice.addExpense(expense);
    }


    @GetMapping("/api/expenses")
    public List<Expense> getAllExpenses() {

        return eservice.getAllExpenses();
    }


    @GetMapping("/api/expenses/{id}")
    public Expense getExpenseById(
            @PathVariable Integer id) {

        return eservice.getExpenseById(id);
    }


    @PutMapping("/api/expenses")
    public Expense updateExpense(
            @RequestBody Expense expense) {

        return eservice.updateExpense(expense);
    }


    @DeleteMapping("/api/expenses/{id}")
    public void deleteExpense(
            @PathVariable Integer id) {

        eservice.deleteExpense(id);
    }
}