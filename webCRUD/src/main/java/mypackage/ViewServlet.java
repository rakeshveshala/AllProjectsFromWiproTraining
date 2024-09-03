package mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Contact;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private Connection con;
    public ViewServlet() throws SQLException, ClassNotFoundException {
        super();
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contacts","root","Rakesh@2000");
        //System.out.println("Connection established");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			List<Contact> contactlist=new ArrayList<>();
			PreparedStatement stat=con.prepareStatement("select * from person");
			ResultSet result=stat.executeQuery();
			while (result.next()){
				Contact c=new Contact();
				c.setFname(result.getString(1));
				c.setLname(result.getString(2));
				c.setMobile(result.getString(3));
				contactlist.add(c);
			}
			ServletContext cont=getServletConfig().getServletContext(); 
			cont.setAttribute("contactinfo",contactlist);
			
			RequestDispatcher dis=cont.getRequestDispatcher("/Jsp/ViewContacts.jsp");
			dis.forward(request,response);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
