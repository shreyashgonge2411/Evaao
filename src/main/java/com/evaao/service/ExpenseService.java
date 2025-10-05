package com.evaao.service;

import java.util.List;

import com.evaao.entity.Expense;

public interface ExpenseService {
    Expense addExpense(Expense expense);
    List<Expense> getAllExpenses();
    Expense updateExpense(Long id, Expense expense);
    void deleteExpense(Long id);
	Expense getExpenseById(Long id);
}

