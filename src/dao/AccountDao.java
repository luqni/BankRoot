package dao;

import java.util.List;

import Bisnis.Account;

public interface AccountDao {
	void insert(Account account) throws Exception;
	void update(Account account) throws Exception;
	void delete(int id) throws Exception;
	void select (Account account) throws Exception;
//	Static List<Account> getList() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
	List<Account> getList() throws Exception;
}

