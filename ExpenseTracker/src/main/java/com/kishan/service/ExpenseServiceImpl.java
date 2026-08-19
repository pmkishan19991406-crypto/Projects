package com.kishan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.model.Expense;
import com.kishan.repository.IExpenseRepository;

@Service
public class ExpenseServiceImpl implements IExpenseService {

    @Autowired
    private IExpenseRepository erepo;


    @Override
    public Expense addExpense(Expense expense) {

        return erepo.save(expense);
    }


    @Override
    public List<Expense> getAllExpenses() {

        return erepo.findAll();
    }


    @Override
    public Expense getExpenseById(Integer id) {

        Optional<Expense> optional = erepo.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        }

        return null;
    }


    @Override
    public Expense updateExpense(Expense expense) {

        Optional<Expense> optional =
                erepo.findById(expense.getId());

        if (optional.isPresent()) {

            Expense existing = optional.get();

            existing.setTitle(expense.getTitle());
            existing.setCategory(expense.getCategory());
            existing.setAmount(expense.getAmount());
            existing.setExpenseDate(expense.getExpenseDate());

            return erepo.save(existing);
        }

        return null;
    }


    @Override
    public void deleteExpense(Integer id) {

        if (erepo.existsById(id)) {

            erepo.deleteById(id);
        }
    }
}