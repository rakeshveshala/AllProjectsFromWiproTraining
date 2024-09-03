package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
	String firstname=req.getParameter("fname");
	String lastname=req.getParameter("lname");
	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	out.println("<font color=blue>First Name: "+firstname+" Last Name is "+lastname);
	}

}
