package com.revature.dao;

import java.util.List;

import com.revature.beans.Transaction;

/**
 * The data access object interface for Transactions
 */
public interface TransactionDao {
	
	/**
	 * This method should retrieve all transactions of all accounts in chronological order
	 * @return a list of transactions ordered by timestamp
	 */
	public List<Transaction> getAllTransactions();
}
