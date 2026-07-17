package com.project.product_expense_tracker.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(nullable = false)
     private String userName;
	@Column(nullable = false)
     private String hashedPassword;
	@Column(nullable = false)
     private String userEmail;
     @Column(name = "createdAt", insertable = false, updatable = false)
     private LocalDateTime createdAt;
     @OneToMany(mappedBy = "user")
     private List<Category> categories;
     @OneToMany(mappedBy="user")
     private List<Wallet> wallets;
     @OneToMany (mappedBy="user")
     private List<TransactionTracker> transactions;
     @OneToMany(mappedBy="user")
     private List<Budget> userbudget;
	//No-Arg Constructor
	public User()
     {
    	 
     }
	public User(String userName, String hashedPassword, String userEmail) {
		this.userName = userName;
		this.hashedPassword = hashedPassword;
		this.userEmail = userEmail;
	}
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	public List<Category> getCategories() 
	{
			return categories;
	}
	public List<Wallet> getWallets() {
		return wallets;
	}
	
	public List<Budget> getUserbudget() {
		return userbudget;
	}
	public List<TransactionTracker> getTransactions() {
		return transactions;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", createdAt="
				+ createdAt  + "]";
	}
	
 
}
