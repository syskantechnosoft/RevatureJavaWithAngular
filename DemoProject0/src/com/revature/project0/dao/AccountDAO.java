package com.revature.project0.dao;

import java.util.List;

import com.revature.project0.beans.Account;

public interface AccountDAO {

	public List<Account> getAccounts();

	public Account getAccount(int accountId);

	public void addAccount(Account account);

	public void updateAccount(int accountId, Account account);

	public void deleteAccount(int accountId);

}
