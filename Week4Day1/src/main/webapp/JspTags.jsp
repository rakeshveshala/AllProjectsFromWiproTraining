<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.text.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int x=10; %>
<%
out.println("Value of x is "+x);
%>
<h2>Value of x using Expression is : <%=x %></h2>
<h3>The current Date and time is : <%
Date d1=new Date();
SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy h:m:s"); String strdate=dateformat.format(d1);
out.println("Current dae is "+strdate);
%></h3>
</body>
</html>