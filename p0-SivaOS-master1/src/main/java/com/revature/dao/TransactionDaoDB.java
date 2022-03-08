package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Account;
import com.revature.beans.Transaction;
import com.revature.beans.Transaction.TransactionType;
import com.revature.utils.ConnectionUtil;

public class TransactionDaoDB implements TransactionDao {
	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public TransactionDaoDB() {
		conn = ConnectionUtil.getConnection();
	}

	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		List<Transaction> transactionList = new ArrayList<Transaction>();
		String query = "select * from transaction";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Transaction transaction = new Transaction();
				transaction.setType((TransactionType) rs.getObject("transaction_type"));
				transaction.setSender((Account) rs.getObject("from_accountId"));
				if ((TransactionType) rs.getObject("transaction_type") == TransactionType.TRANSFER) {
					transaction.setRecipient((Account) rs.getObject("to_accountId"));
				}
				transaction.setTimestamp((LocalDateTime) rs.getObject("timestamp"));
				transaction.setAmount(rs.getDouble("amount"));
				transactionList.add(transaction);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return transactionList;
	}

}
