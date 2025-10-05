package com.evaao.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.evaao.entity.Expense;
import com.evaao.service.ExpenseService;

@Controller
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // Home Page
    @GetMapping("/")
    public String viewHome(Model model) {
        model.addAttribute("expenses", expenseService.getAllExpenses());
        model.addAttribute("expense", new Expense());
        return "index";
    }

    // Add Expense
    @PostMapping("/add")
    public String addExpense(@ModelAttribute Expense expense) {
        expenseService.addExpense(expense);
        return "redirect:/";
    }

    // Delete Expense
    @GetMapping("/delete/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/";
    }

    // Edit Expense
    @GetMapping("/edit/{id}")
    public String editExpense(@PathVariable Long id, Model model) {
        model.addAttribute("expense", expenseService.getExpenseById(id));
        return "edit";
    }

    @PostMapping("/update/{id}")
    public String updateExpense(@PathVariable Long id, @ModelAttribute Expense expense) {
        expenseService.updateExpense(id, expense);
        return "redirect:/";
    }
}
