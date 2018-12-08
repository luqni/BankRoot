package Presentation;
import java.util.Scanner;

import Bisnis.Account;

import java.util.List;

import Data.AccountDB;
import dao.AccountDao;

public class MainApp {

	public static void main(String[] args) throws Exception {
		MainApp inti = new MainApp();
//		CustomerDao customerDao = new CustomerDummyDaoImpl();
		AccountDao accountDao = new AccountDB();
		Scanner i = new Scanner(System.in);
		System.out.print("Input Account Number : ");
		String accountNumber = i.nextLine();
		System.out.print("Input Name : ");
		String name = i.nextLine();
		System.out.print("Input Address : ");
		String address = i.nextLine();
		System.out.println(" ");
		
		
		Account inputaccount = new Account(0, accountNumber, name, address);
		
		accountDao.insert(inputaccount);
		inti.view();
		
	
		
		
	}
	public void inputData() {
		
	}
	
	public void view() throws Exception {
		AccountDao accountDao = new AccountDB();
		List<Account> list = accountDao.getList();
		if(list!=null && !list.isEmpty()) {
			for (Account account : list) {
				System.out.println("*********************************************");
				System.out.println("Nomor Rekening : "+account.getAccount_number());
				System.out.println("Nama           : "+account.getName() );
				System.out.println("Alamat         : "+account.getAddress());
				System.out.println("*********************************************");
				System.out.println(" ");
			}
			
		}else {
			System.out.println("empty data");
		}
		
	}

}
