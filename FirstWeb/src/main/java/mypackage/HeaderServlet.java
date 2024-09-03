package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
	public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{

	PrintWriter out=res.getWriter();
	res.setContentType("text/html");
	
	out.println("<table><tr><th>HeaderName</th><th>Header Value</th></tr>");

	Enumeration<String> headers=req.getHeaderNames();

	while (headers.hasMoreElements()){
		String name=headers.nextElement();
		String value=req.getHeader(name);
		out.println("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
	}
	
	}
}
