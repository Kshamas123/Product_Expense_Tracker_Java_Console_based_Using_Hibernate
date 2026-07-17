package com.project.product_expense_tracker.models;

import java.util.List;

import Enum_class.CategoryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	@Column(nullable = false)
	private String categoryName;
	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	@OneToMany (mappedBy="category")
    private List<TransactionTracker> transactions;
	@OneToMany(mappedBy="category")
    private List<Budget> userbudget;
	
	public Category(String categoryName, CategoryType categoryType, User user) {
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.user = user;
	}
	public Category() {
		
	}
	public int getCategoryId() {
		return categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public CategoryType getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
	public User getUser() {
		return user;
	}
	public List<Budget> getUserbudget() {
		return userbudget;
	}
	
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryType="
				+ categoryType + ", User Id=" + user.getUserId() + "]";
	}
	
}
