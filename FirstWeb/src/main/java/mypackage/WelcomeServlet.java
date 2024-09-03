package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter out = res.getWriter();
		
		HttpSession ses=req.getSession(false);
		if(ses!=null) {
			String user=(String)req.getAttribute("name1");
			out.println("Welcome to Servlet Application "+user);
		}
		else {
			out.println("Session not exist");
		}
		
		
	}
//	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
//	{
//		PrintWriter out=res.getWriter();
//		
//		/* 
//		 * Print writer is interface which can be used to print anything on reponse.
//		 * We are retreive reference of writer for response
//		 */
//		out.println("Welcome to Servlet Application");
//		
//	}
}
