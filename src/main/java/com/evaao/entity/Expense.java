package com.evaao.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @Column(nullable = false)
    private String note;

    private String category;

    private LocalDate date;

	public Expense(Long id, double amount, String note, String category, LocalDate date) {
		super();
		this.id = id;
		this.amount = amount;
		this.note = note;
		this.category = category;
		this.date = date;
	}

	public Expense() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

   
}

