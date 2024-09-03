package mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Insertservlet
 */
@WebServlet("/insertServlet")
public class Insertservlet extends HttpServlet {
	private Connection con;
	
	public Insertservlet() throws ClassNotFoundException, SQLException {
        super();
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Rakesh@2000");
        //System.out.println("Connection established");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("fname");
		String lastname=request.getParameter("lname");
		String mobile=request.getParameter("mobile");
		try
		{
		PreparedStatement stat=
		con.prepareStatement("insert into person values(?,?,?)");
		stat.setString(1, firstname);
		stat.setString(2, lastname);
		stat.setString(3, mobile);
		int result=stat.executeUpdate();
		if (result>0){
		System.out.println("Dt inserted");
		}
		} 
		catch (SQLException ex){
			System.out.println("Excepiton is "+ex.getMessage());
		}
	}

}