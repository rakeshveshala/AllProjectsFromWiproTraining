package util;
import java.sql.*;
public class DBConnection {
	private static Connection con;
	private DBConnection() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","Rakesh@2000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static Connection getInstance() {
		DBConnection db1 =new DBConnection();
		return con;
	}
	public static void main(String[] args) {
		getInstance();
		System.out.println("yes");
	}
}
