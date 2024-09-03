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
<form:form action="insertEmployee" method="post" modelAttribute="eobj">
<table>
<tr>
<td>Employee id</Td>
<td><form:input path="empid"/></td> <!-- here path name must match with the name of field in employee class like empid empname and salary -->
</tr>
<tr>
<td>Employee Name</td>
<td><form:input path="empname"/></td>
</tr>
<tr>
<td>Salary</td>
<td><form:input path="salary"/></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Click here"/></td>
</table>
</form:form>
</body></html>