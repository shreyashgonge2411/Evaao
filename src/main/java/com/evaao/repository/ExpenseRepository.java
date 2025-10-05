package com.evaao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evaao.entity.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByCategory(String category);
}

