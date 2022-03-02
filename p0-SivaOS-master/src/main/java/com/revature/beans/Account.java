package com.revature.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Represents a bank account that a User can own.
 * Every account can be of type CHECKING or SAVINGS.
 * Every account keeps a record of transactions on that account
 * Accounts must be approved before transactions can be performed on it.
 */
public class Account implements Serializable {
	/**Automatically generated universally unique identifier */
	private static final long serialVersionUID = -662794077232408056L;

	public static enum AccountType {
		CHECKING, SAVINGS
	}
	private Integer accountId;
	private Integer ownerId;
	private Double balance;
	private AccountType type;
	private boolean approved;
	private List<Transaction> transactions;
	
	public Integer getId() {
		return accountId;
	}
	public void setId(Integer id) {
		this.accountId = id;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (approved ? 1231 : 1237);
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
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
		Account other = (Account) obj;
		if (approved != other.approved)
			return false;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (ownerId == null) {
			if (other.ownerId != null)
				return false;
		} else if (!ownerId.equals(other.ownerId))
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + accountId + ", ownerId=" + ownerId + ", balance=" + balance + ", type=" + type + ", approved="
				+ approved + ", transactions=" + transactions + "]";
	}
	
}
