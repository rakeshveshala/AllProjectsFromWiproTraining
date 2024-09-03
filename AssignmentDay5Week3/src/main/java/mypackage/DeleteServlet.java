package mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private Connection con;
	private static final long serialVersionUID = 1L;
	public DeleteServlet()throws ClassNotFoundException,SQLException {
       super();
       Class.forName("com.mysql.cj.jdbc.Driver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Rakesh@2000");
       //System.out.println("Connection establishe");
   }
   /**
    * @see HttpServlet#HttpServlet()
    */
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try
	{
 		String mob=request.getParameter("mobile");
	PreparedStatement stat=con.prepareStatement("delete from person where mobileno=?");
	stat.setString(1, mob);
	int result=stat.executeUpdate();
	if(result>0)
	{
		
		RequestDispatcher dis=getServletContext().getRequestDispatcher("/ViewServlet");
		dis.forward(request,response);
		
	}
 	
 	}
 	catch(Exception ex)
 	{
 		System.out.println(ex.getMessage());
 	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
 	}
}
