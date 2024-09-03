<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="MovieData" method="post" modelAttribute="movieobj">
<table>
<tr>
	<td>Movie Code</td>
	<td><form:input path="moviecode"/></td>
</tr>
<tr>
	<td>MovieTitle</td>
	<td><form:input path="movietitle"/></td>
</tr>
<tr>
	<td>Price</td>
	<td><form:input path="price"/></td>
</tr>
<tr>
	<td>Duration</td>
	<td><form:input path="duration"/></td>
</tr>
<tr>
	<td></td>
	<Td><input type="submit" value="Click here"></Td>
</table>
</form:form>

</body>
</html>