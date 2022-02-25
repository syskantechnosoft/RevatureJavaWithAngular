package com.revature;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private int id;
	private String accountNumber;
	private String accountType;
	private double balance;
	private int customerId;
	private transient String SSN;

	public BankAccount(int id, String accountNumber, String accountType, double balance, int customerId) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
	}

	public BankAccount(int id, String accountNumber, String accountType, double balance, int customerId, String SSN) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
		this.SSN = SSN;
	}

	public BankAccount() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType
				+ ", balance=" + balance + ", customerId=" + customerId + ", SSN=" + SSN + "]";
	}

}
