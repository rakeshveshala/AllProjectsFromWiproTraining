<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 double amount=Double.parseDouble (request.getParameter("balance"));
 double rate=Double.parseDouble (request.getParameter("interest"));
 double interestamount=(amount*rate)/100;
 %>
 <h3>interest Amount is: <%=interestamount %></h3>

 </body>
</html>