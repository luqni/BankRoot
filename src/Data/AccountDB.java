package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bisnis.Account;
import dao.AccountDao;

public class AccountDB implements AccountDao{
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    static final String DB_URL = "jdbc:mysql://localhost/shop";
    static final String USER = "root";
    static final String PASS = "";

	@Override
	public void insert(Account account) throws Exception {
		// TODO Auto-generated method stub
		preparedStatement = getConnection().prepareStatement("INSERT INTO `shop`.`account1`\n" + 
        		"(`account_number`, `name`, `address`)\n" + 
        		"VALUES\n" + 
        		"(?,?,?)");
		preparedStatement.setString(1, account.getAccount_number());
        preparedStatement.setString(2, account.getName());
        preparedStatement.setString(3, account.getAddress());
        preparedStatement.executeUpdate();			
		
	}

	@Override
	public void update(Account account) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		classBantu.getInstance().delete(id);
		
	}


	public List<Account> getList() throws Exception {
		// TODO Auto-generated method stub
		statement = getConnection().createStatement();
        resultSet = statement.executeQuery("select * from account1");
       
        List<Account> list = new ArrayList<>();
        while (resultSet.next()) {
        	Account account = new Account();
        	account.setId(resultSet.getInt("id"));
        	account.setAccount_number(resultSet.getString("account_number"));
        	account.setName(resultSet.getString("name"));
        	account.setAddress(resultSet.getString("address"));
        	
        	list.add(account);
		}
		return list;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if(connect == null || connect.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver");
			
	        connect = DriverManager.getConnection(DB_URL, USER, PASS);
	        
		}
		return connect;
	}

	@Override
	public void select(Account account) throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
