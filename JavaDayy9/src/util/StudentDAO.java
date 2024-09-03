package util;
import java.sql.*;
public class StudentDAO {
	private Connection con;
	private Statement stat;
	
	public StudentDAO(){
		con=DBConnection.getInstance();
	}
	
	public void insertStudent() throws SQLException {
		stat = con.createStatement();
		int result = stat.executeUpdate("insert into student values(4,\"hari\",30,\"877622366999\",\"Delhi\",4);\r\n"
				+ "");
		if(result>0) {
			System.out.println("inserted successfully");
		}
	}
	
	public static void main(String[] args) {
		StudentDAO sdao = new StudentDAO();
		try {
			sdao.insertStudent();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
