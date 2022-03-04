package com.revature.project0.beans;

import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
	private int id;
	private int fromAccount;
	private int toAccount;
	private String transactionType;
	private double amount;
//	private Timestamp timestamp;
	private LocalDateTime timestamp;

	public Transaction(int id, int fromAccount, int toAccount, String transactionType, double amount,
			LocalDateTime timestamp) {
		super();
		this.id = id;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transactionType = transactionType;
		this.amount = amount;
		this.timestamp = timestamp;
	}

	public Transaction() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}

	public int getToAccount() {
		return toAccount;
	}

	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, fromAccount, id, timestamp, toAccount, transactionType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& fromAccount == other.fromAccount && id == other.id && Objects.equals(timestamp, other.timestamp)
				&& toAccount == other.toAccount && Objects.equals(transactionType, other.transactionType);
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
				+ ", transactionType=" + transactionType + ", amount=" + amount + ", timestamp=" + timestamp + "]";
	}

}
