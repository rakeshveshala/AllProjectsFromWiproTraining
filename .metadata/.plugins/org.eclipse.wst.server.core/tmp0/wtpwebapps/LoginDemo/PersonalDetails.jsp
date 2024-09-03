<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="PersonalServlet" method="post">
<table>
	<tr>
		<td>First Name</td>
		<td><input type="text" name="fname"/></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" name="lname"/></td>
	</tr>
	<tr>
		<td>MobileNumber</td>
		<td><input type="text" name="mobile"/></td>
	</tr>
	
	<tr>
		<td></td>
		<td><input type="submit" value="Submit Data"/></td>
	</tr>
</table>
</form>
</body>
</html>