package com.revature.project0.dao;

import java.util.List;

import com.revature.project0.beans.Transaction;

public interface TransactionDAO {

	public List<Transaction> getTransactions();

	public Transaction getTransaction(int transactionId);

	public void addTransaction(Transaction transaction);

}
