package com.project.product_expense_tracker.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
	    name = "budget",
	    uniqueConstraints = {
	        @UniqueConstraint(
	            name = "uq_budget",
	            columnNames = {
	                "userId",
	                "categoryId",
	                "budgetMonth",
	                "budgetYear"
	            }
	        )
	    }
	)
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int budgetId;
	@ManyToOne
	@JoinColumn(name = "userId")
   private User user;
   @Column(nullable = false, precision = 12, scale = 2)
   private BigDecimal budgetAmount;
    @ManyToOne
	@JoinColumn(name = "categoryId")
   private Category category;
    @Column(nullable = false)
    private int budgetMonth;

    @Column(nullable = false)
    private int budgetYear;
	public BigDecimal getBudgetAmount() {
		return budgetAmount;
	}
	public void setBudgetAmount(BigDecimal budgetAmount) {
		this.budgetAmount = budgetAmount;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getBudgetMonth() {
		return budgetMonth;
	}
	public void setBudgetMonth(int budgetMonth) {
		this.budgetMonth = budgetMonth;
	}
	public int getBudgetYear() {
		return budgetYear;
	}
	public void setBudgetYear(int budgetYear) {
		this.budgetYear = budgetYear;
	}
	public int getBudgetId() {
		return budgetId;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String toString() {
		return "Budget [budgetId=" + budgetId + ", user=" + user.getUserName() + ", budgetAmount=" + budgetAmount + ", category="
				+ category.getCategoryName() + ", budgetMonth=" + budgetMonth + ", budgetYear=" + budgetYear + "]";
	}
	
   
   
}
