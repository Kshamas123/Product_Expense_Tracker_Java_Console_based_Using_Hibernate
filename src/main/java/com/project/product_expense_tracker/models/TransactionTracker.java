package com.project.product_expense_tracker.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="userTransaction")
public class TransactionTracker {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int transactionId;
	  @ManyToOne
	  @JoinColumn(name = "userId")
      private User user;
	  @ManyToOne
	  @JoinColumn(name = "categoryId")
      private Category category;
	  @ManyToOne
	  @JoinColumn(name = "walletId")
      private Wallet wallet;
	  @Column(nullable = false, precision = 12, scale = 2)
	  private BigDecimal amount;
      @Column(name = "createdAt", insertable = false, updatable = false)
      private LocalDateTime createdAt;
      private LocalDateTime transactionDate;
      @Column(nullable = false, length = 255)
      private String transactionDescription;
      
      
      public TransactionTracker() {
		
	}

	public TransactionTracker(
    	        User user,
    	        Category category,
    	        Wallet wallet,
    	        BigDecimal amount,
    	        LocalDateTime transactionDate,
    	        String transactionDescription) {

    	    this.user = user;
    	    this.category = category;
    	    this.wallet = wallet;
    	    this.amount = amount;
    	    this.transactionDate = transactionDate;
    	    this.transactionDescription = transactionDescription;
    	}
      
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public User getUser() {
		return user;
	}
	public Category getCategory() {
		return category;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "TransactionTracker [transactionId=" + transactionId + ", amount=" + amount + ", createdAt=" + createdAt
				+ ", transactionDate=" + transactionDate + ", transactionDescription=" + transactionDescription + "]";
	}
      
      
}
