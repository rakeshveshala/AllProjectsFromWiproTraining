<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,pojo.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
<tr>
<td>FirstName</td>
<td>LastName</Td>
<td>Mobile</td>
<td colspan="2">Action</td>
</Tr>
<%
List<Contact> clist=(List<Contact>)application.getAttribute("contactinfo");
for(Contact contact:clist){ 
%>
<tr>
<Td><%=contact.getFname()%></td>
<td><%=contact.getLname() %></td>
<td><%=contact.getMobile () %></td>
<td><a href="/webCRUD/DeleteServlet?mobile=<%=contact.getMobile()%>">Delete</a></td>
<td><a href="#">Update</a></td>
</tr>
<%
}
%>
</table>
</body>
</html>