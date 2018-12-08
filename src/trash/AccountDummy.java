package trash;

import java.util.List;

import Bisnis.Account;
import Data.classBantu;
import dao.AccountDao;

public class AccountDummy implements AccountDao{

	@Override
	public void insert(Account account) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public List<Account> getList()  throws Exception{
		return classBantu.getInstance().getAllData();
	}

}
