package com.project.product_expense_tracker.models;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int walletId;
    @Column(nullable = false)
	private String walletName;
    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal walletBalance;
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	@OneToMany (mappedBy="wallet")
    private List<TransactionTracker> transactions;
	//No-arg Constructor
	public Wallet() {
		
	}
	public Wallet(String walletName, BigDecimal walletBalance, User user) {
		this.walletName = walletName;
		this.walletBalance = walletBalance;
		this.user = user;
	}
	public String getWalletName() {
		return walletName;
	}
	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}
	public BigDecimal getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(BigDecimal walletBalance) {
		this.walletBalance = walletBalance;
	}
	public int getWalletId() {
		return walletId;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String toString() {
		return "Wallet [walletId=" + walletId + ", walletName=" + walletName + ", walletBalance=" + walletBalance
				+ ", User Id=" + user.getUserId() + "]";
	}
	
	
	
	
}
