package com.evaao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaao.entity.Expense;
import com.evaao.repository.ExpenseRepository;
import com.evaao.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public Expense addExpense(Expense expense) {
        if (expense.getAmount() < 0) {
            throw new IllegalArgumentException("Expense amount must be greater than 0");
        }
        if (expense.getNote() == null || expense.getNote().isBlank()) {
            throw new IllegalArgumentException("Note cannot be empty");
        }
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).get();
    }

    @Override
    public Expense updateExpense(Long id, Expense updatedExpense) {
        Expense existingExpense = getExpenseById(id);

        existingExpense.setAmount(updatedExpense.getAmount());
        existingExpense.setNote(updatedExpense.getNote());
        existingExpense.setCategory(updatedExpense.getCategory());
        existingExpense.setDate(updatedExpense.getDate());

        return expenseRepository.save(existingExpense);
    }

    @Override
    public void deleteExpense(Long id) {
        Expense existingExpense = getExpenseById(id);
        expenseRepository.delete(existingExpense);
    }
}

