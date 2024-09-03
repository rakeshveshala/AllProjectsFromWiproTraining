package jdbcandservlet;

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
 * Servlet implementation class PersonalServlet
 */
@WebServlet("/JdbcServlet")
public class JdbcServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/personaldemo","root","Rakesh@2000");
	PreparedStatement stat=con.prepareStatement("insert into Person values(?,?,?)");
	String firstname=request.getParameter("fname");
	String lastname=request.getParameter("lname");
	String mob=request.getParameter("mobile");
	stat.setString(1,firstname);
	stat.setString(2,lastname);
	stat.setString(3, mob);
	int result=stat.executeUpdate();
	if(result>0)
	{
		System.out.println("Data inserted");
	}
	
	
	}
	catch(SQLException ex)
	{
		System.out.println(ex.getMessage());
	}
	catch(ClassNotFoundException ex)
	{
		System.out.println(ex.getMessage());
	}
	}

}
