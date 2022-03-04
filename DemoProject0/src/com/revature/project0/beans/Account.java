package com.revature.project0.beans;

import java.util.List;
import java.util.Objects;

public class Account {
	private int id;
	private int owner_id;
	private String accountType;
	private double balance;
	private boolean approved;
	private List<Transaction> transactions;

	public Account(int id, int owner_id, String accountType, double balance, boolean approved,
			List<Transaction> transactions) {
		super();
		this.id = id;
		this.owner_id = owner_id;
		this.accountType = accountType;
		this.balance = balance;
		this.approved = approved;
		this.transactions = transactions;
	}

	public Account() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountType, approved, balance, id, owner_id, transactions);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountType, other.accountType) && approved == other.approved
				&& Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance) && id == other.id
				&& owner_id == other.owner_id && Objects.equals(transactions, other.transactions);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", owner_id=" + owner_id + ", accountType=" + accountType + ", balance=" + balance
				+ ", approved=" + approved + ", transactions=" + transactions + "]";
	}

}
