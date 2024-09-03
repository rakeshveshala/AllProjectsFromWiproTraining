package util;
import java.sql.*;
import java.util.Scanner;
public class BookDAOPrepare {
	private Connection con;
	private PreparedStatement stat;
	private static Scanner sc; 
	
	public BookDAOPrepare(){
		con=DBConnection.getInstance();
		sc = new Scanner(System.in);
	}
	
	public void insertBook() throws SQLException {
		System.out.println("Enter book id: ");
		int bookid=sc.nextInt();
		System.out.println("Enter book title: ");
		String bookTitle=sc.next();
		System.out.println("Enter price: ");
		double price=sc.nextDouble();
		System.out.println("Enter quantity: ");
		int quantity=sc.nextInt();
		
		
		stat = con.prepareStatement("insert into book values(?,?,?,?)");
		stat.setInt(1,bookid);
		stat.setString(2, bookTitle);
		stat.setDouble(3, price);
		stat.setInt(4, quantity);
		
		int result = stat.executeUpdate();
		if(result>0) {
			System.out.println("successfully inserted");
		}
		
		
	}
	
	public static void main(String[] args) {
		BookDAOPrepare book = new BookDAOPrepare();
		System.out.println("Enter how many records you want to enter");
		int num=sc.nextInt();
		int i=0;
		while(i<num) {
			try {
				book.insertBook();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
