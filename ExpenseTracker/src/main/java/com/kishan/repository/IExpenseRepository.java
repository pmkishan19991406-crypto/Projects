package com.kishan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishan.model.Expense;

public interface IExpenseRepository extends JpaRepository<Expense, Integer> {

}
