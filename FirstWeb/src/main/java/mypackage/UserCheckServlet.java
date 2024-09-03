package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserCheckServlet")
public class UserCheckServlet extends HttpServlet {
	RequestDispatcher dis=null;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String log=request.getParameter("fuser");
		String pass=request.getParameter("fpass"); 
		PrintWriter out=response.getWriter();
		HttpSession ses;
		
		if (log.equals("admin") &&pass.equals("admin")){
			
			ses=request.getSession(); //generate a new session if session not exists
			
			dis=getServletContext().getRequestDispatcher("/Welcome"); 
			ses.setAttribute("name1", log);
			dis.forward (request, response);
		}
		else{
			dis=getServletContext().getRequestDispatcher("/Login.html");
			dis.include (request, response); 
			out.println("<font color=red>Invalid id or password</font>");
		}
	}

}
