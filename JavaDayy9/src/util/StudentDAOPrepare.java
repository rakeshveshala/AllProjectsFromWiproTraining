package util;
import java.sql.*;
import java.util.Scanner;
public class StudentDAOPrepare {
	private Connection con;
	private PreparedStatement stat;
	private Scanner sc; 
	
	public StudentDAOPrepare(){
		con=DBConnection.getInstance();
		sc = new Scanner(System.in);
	}
	
	public void insert() throws SQLException {
		System.out.println("Enter student id: ");
		int id=sc.nextInt();
		System.out.println("Enter student name: ");
		String name=sc.next();
		System.out.println("Enter student score: ");
		double score=sc.nextDouble();
		System.out.println("Enter student adress: ");
		String adress=sc.next();
		System.out.println("Enter student mobile no: ");
		String mobileno=sc.next();
		System.out.println("Enter college code: ");
		int code=sc.nextInt();
		
		stat = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		stat.setInt(1,id);
		stat.setString(2, name);
		stat.setDouble(3, score);
		stat.setString(4, adress);
		stat.setString(5, mobileno);
		stat.setInt(6,code);
		int result = stat.executeUpdate();
		if(result>0) {
			System.out.println("successfully inserted");
		}
		
		
	}
	public void delete() throws SQLException{
		System.out.println("enter the student code which you want to delete:");
		int code=sc.nextInt();
		stat = con.prepareStatement("delete from student where studentcode=?");
		stat.setInt(1, code);
		int result = stat.executeUpdate();
		if(result>0) {
			System.out.println("deleted successfully");
		}
	}
	public void update() throws SQLException {
		System.out.println("enter student code where you want to update: ");
		int code = sc.nextInt();
		System.out.println("enter new Score");
		double score = sc.nextDouble();
		System.out.println("enter new adress to update");
		String adress = sc.next();
		stat = con.prepareStatement("update student set score=?, address=? where collegecode=?");
		stat.setDouble(1, score);
		stat.setString(2, adress);
		stat.setInt(3, code);
		int result = stat.executeUpdate();
		if(result>0) {
			System.out.println("updated successfully");
		}
	}
	public void retrieve() throws SQLException {
		stat = con.prepareStatement("select * from student");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getDouble(3));
			System.out.println(result.getString(4));
			System.out.println(result.getString(5));
		}
	}
	public void uservalidate() throws SQLException{
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String password=sc.next();
		stat=con.prepareStatement("select * from users where username=? and password=?");
		stat.setString(1, username);
		stat.setString(2, password);
		ResultSet res = stat.executeQuery();
		if(res.next()) {
			System.out.println("valid user");
			menu();
		}
		else {
			System.out.println("not a valid user");
			System.exit(0);
		}
	}
	public void menu()throws SQLException
	{
		String choice="y";
		while(choice.equals("y"))
		{
			System.out.println("1. Insert Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Update Student");
			System.out.println("4. View Students ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
					insert();
					break;
			case 2:
					delete();
					break;
			case 3:
					update();
					break;
			case 4:
				retrieve();
				break;
			}
			System.out.println("Do u want to continue");
			choice=sc.next();
		}
	}
	public static void main(String[] args) {
		StudentDAOPrepare sdao=new StudentDAOPrepare();
		try
		{
			sdao.uservalidate();
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
