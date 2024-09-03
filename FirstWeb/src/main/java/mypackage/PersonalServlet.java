package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/PersonalServlet")
public class PersonalServlet extends HttpServlet {

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
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
	int result = stat.executeUpdate();
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	if (result > 0) {
//	    out.println("<html><body>");
//	    out.println("<h1>Welcome, " + firstname + "!</h1>");
//	    out.println("<p>Your email address is: " + lastname + "</p>");
//	    out.println("</body></html>");
		out.println("Data Inserted");
	} else {
	    out.println("<font color='red'>Data insertion failed</font>");
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
