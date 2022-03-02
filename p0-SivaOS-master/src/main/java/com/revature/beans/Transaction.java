package com.revature.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * An individual transaction that can be performed on an account.
 * Can be a withdrawal, deposit or transfer.
 * For withdrawals or deposits, the toAccountId field is null.
 */
public class Transaction implements Serializable {
	/**Automatically generated universally unique identifier */
	private static final long serialVersionUID = 4244173215207746743L;
	
	public static enum TransactionType {
		WITHDRAWAL, DEPOSIT, TRANSFER
	}
	private Account fromAccountId;
	private Account toAccountId;
	private Double amount;
	private TransactionType type;
	private LocalDateTime timestamp;
	
	public Account getSender() {
		return fromAccountId;
	}
	public void setSender(Account sender) {
		this.fromAccountId = sender;
	}
	public Account getRecipient() {
		return toAccountId;
	}
	public void setRecipient(Account recipient) {
		if (this.fromAccountId == null) {
			throw new UnsupportedOperationException("Sender must be set");
		} else if (this.fromAccountId.equals(this.toAccountId)) {
			throw new UnsupportedOperationException("Sender and recipient cannot be same account");
		}
		this.toAccountId = recipient;
		this.type = TransactionType.TRANSFER;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		if (amount <= 0) {
			throw new UnsupportedOperationException("Transaction amount cannot be negative or 0");
		}
		this.amount = amount;
	}
	public TransactionType getType() {
		return type;
	}
	public void setType(TransactionType type) {
		this.type = type;
		if (type.equals(TransactionType.DEPOSIT) || type.equals(TransactionType.WITHDRAWAL)) {
			this.toAccountId = null;
		}
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public void setTimestamp() {
		this.timestamp = LocalDateTime.now();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((toAccountId == null) ? 0 : toAccountId.hashCode());
		result = prime * result + ((fromAccountId == null) ? 0 : fromAccountId.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
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
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (toAccountId == null) {
			if (other.toAccountId != null)
				return false;
		} else if (!toAccountId.equals(other.toAccountId))
			return false;
		if (fromAccountId == null) {
			if (other.fromAccountId != null)
				return false;
		} else if (!fromAccountId.equals(other.fromAccountId))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Transaction [sender=" + fromAccountId + ", recipient=" + toAccountId + ", amount=" + amount + ", type=" + type
				+ ", timestamp=" + timestamp + "]";
	}
	
}
