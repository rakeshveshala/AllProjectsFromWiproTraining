package managebooks;

import java.sql.*;

public class DBConnect {
	private static Connection con;
	private DBConnect() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","Rakesh@2000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static Connection getInstance() {
		DBConnect db1 =new DBConnect();
		return con;
	}
	public static void main(String[] args) {
		getInstance();
	}
}
