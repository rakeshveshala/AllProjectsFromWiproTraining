package managebooks;

import java.sql.*;
import java.util.*;


public class BooksMain {
	private Connection con;
	private static Scanner sc;
	private PreparedStatement stat;
	
	private BooksMain() {
		con=DBConnect.getInstance();
		sc = new Scanner(System.in);
	}
	public void insert() throws SQLException {
		System.out.println("how many records you want to insert: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter Book Id: ");
			int id=sc.nextInt();
			System.out.println("Enter Book Name: ");
			String name=sc.next();
			System.out.println("Enter Book Genre: ");
			String genre=sc.next();
			System.out.println("Enter Book Price");
			Double price = sc.nextDouble();
			
			stat = con.prepareStatement("insert into bookstore values(?,?,?,?)");
			stat.setInt(1,id);
			stat.setString(2,name);
			stat.setString(3,genre);
			stat.setDouble(4,price);
			
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("successfully inserted");
			}
		}
	}
	public void delete() throws SQLException{
		System.out.println("how many records you want to delete: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("enter the book id which you want to delete:");
			int code=sc.nextInt();
			stat = con.prepareStatement("delete from bookstore where bookid=?");
			stat.setInt(1, code);
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("deleted successfully");
			}
		}
	}
	
	public void update() throws SQLException {
		System.out.println("how many records you want to update: ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("enter book id where you want to update: ");
			int bookid = sc.nextInt();
			System.out.println("enter book name to update ");
			String name = sc.next();
			System.out.println("enter genre to update");
			String genre = sc.next();
			System.out.println("enter price to update");
			Double price = sc.nextDouble();
			stat = con.prepareStatement("update bookstore set bookname=?, genre=?, price=? where bookid=?");
			stat.setString(1, name);
			stat.setString(2, genre);
			stat.setDouble(3, price);
			stat.setInt(4, bookid);
			int result = stat.executeUpdate();
			if(result>0) {
				System.out.println("updated successfully");
			}
		}
	}
	
	public void retrieve1() throws SQLException {
		stat = con.prepareStatement("select * from bookstore order by price");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getDouble(4));
		}
	}
	public void retrieve2() throws SQLException {
		stat = con.prepareStatement("select * from bookstore order by price desc");
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getDouble(4));
		}
	}
	public void count() throws SQLException{
		stat=con.prepareStatement("select count(*) from bookstore");;
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println("total no of records are :"+result.getInt(1));
		}
	}
	
	public void getGenre() throws SQLException {
		System.out.println("enter the genre you want");
		String genre = sc.next();
		stat=con.prepareStatement("select * from bookstore where genre = ?");
		stat.setString(1, genre);
		ResultSet result = stat.executeQuery();
		while(result.next()) {
			System.out.println("Book Id "+result.getInt(1));
			System.out.println("Book Name "+result.getString(2));
			System.out.println("Book Genre "+result.getString(3));
			System.out.println("Book Price "+result.getDouble(4));
		}
	}
	public void menu() throws SQLException {
		String choice="yes";
		while(choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter Your Choice \n1 For Insert\n2 For Update"
					+ "\n3 For Delete\n4 For Counting The Records\n"
					+ "5 For Displaying Books In Price Incereasing Order"
					+ "\n6 For Displaying Books In Price Decreasing Order\n7 For Searching Books Based On Genre");
			
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				count();
				break;
			case 5:
				retrieve1();
				break;
			case 6:
				retrieve2();
				break;
			case 7:
				getGenre();
				break;
			}
			
			System.out.println("Enter Yes to continue No to Stop");
			choice = sc.next();
		}
	}
	
	public static void main(String[] args) {
		BooksMain obj = new BooksMain();
		try {
			System.out.println("Enter UserName:");
			String uname=sc.next();
			System.out.println("Enter password:");
			String pass=sc.next();
			if(uname.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin")) {
				obj.menu();
			}
			else {
				System.out.println("Incorrect Username or Password!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
