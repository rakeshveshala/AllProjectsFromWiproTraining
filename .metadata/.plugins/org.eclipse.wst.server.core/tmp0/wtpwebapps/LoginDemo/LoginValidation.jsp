<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
  String user=request.getParameter("uname");
  String pass=request.getParameter("password");
  if(user.equals("admin")&&pass.equals("admin"))
  {
  %>
  <jsp:forward page="/Welcome"/>
  <%
  }
  else
  {
  %>
  <jsp:include page="/Login.jsp"/>
  <%
  }
  out.println("Invalid id or password");
  %>

</body>
</html>