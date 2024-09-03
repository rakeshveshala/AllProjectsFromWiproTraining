package util;
import java.sql.*;
public class DBConnection {
	private static Connection con;
	private DBConnection()
	{
		try {
			con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/studentmanagement",
							"root","Rakesh@2000");
			System.out.println("Coonection established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * jdbc: -protocol
		 * mysql-subprotocol
		 * localhost-address of current machine
		 * 3306-port number
		 * studentmanagement-databasename
		 * username=root
		 * password=password
		 *
		 */
		
	}
	public static Connection getInstance()
	{
		DBConnection db1=new DBConnection();
		return con;
	}
	
}
