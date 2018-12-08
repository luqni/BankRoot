package trash;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ConnectionDB {
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/shop";
    static final String USER = "root";
    static final String PASS = "";
    
    private static ConnectionDB ConnectionDB = null;
    
    private ConnectionDB() {
    	try {
    		Class.forName(JDBC_DRIVER);
    	}catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    }
    public Connection getConnection() throws SQLException, ClassNotFoundException {
//    	Class.forName(JDBC_DRIVER);
		Connection conn;
		conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;	
    }
    public static ConnectionDB getInstance() {
    	if (ConnectionDB == null) {
    		ConnectionDB = new ConnectionDB();
    	}
    	return ConnectionDB;
    }
    
}
