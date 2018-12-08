package trash;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultset = null;
	
	public AccountDAO() {
		
	}
	private Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection conn;
		conn = ConnectionDB.getInstance().getConnection();
		return conn;
	}
//	public void add(getData getdata) throws ClassNotFoundException 
//	{
//		try {
//			String queryString = "INSERT INTO account1 (id, account_number,name,address) VALUES (?,?,?,?)";
//			connection = getConnection();
//			System.out.println("masuk");
//			System.out.println(" ");
//			ptmt = connection.prepareStatement(queryString);
//			ptmt.setInt(1, getdata.getId());
//			ptmt.setString(2, getdata.getAccount_number());
//			ptmt.setString(3, getdata.getName());
//			ptmt.setString(4, getdata.getAddress());
//			ptmt.executeQuery();
//			System.out.println("Data Added Successfully");
//			
//			
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
	public void findAll() throws ClassNotFoundException {
		ResultSet resultSet = null;
		try {
			String queryString = "SELECT * FROM account1";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("No " + resultSet.getInt("id")
						+ ", Name " + resultSet.getString("account_number") + ", Nama "
						+ resultSet.getString("name") + ", Address "
						+ resultSet.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
