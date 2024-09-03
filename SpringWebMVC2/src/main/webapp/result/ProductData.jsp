<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Product id</Th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Quantity</th>
	</tr>
<c:forEach items="${productinfo}" var="product">
	<tr>
		<td>${product.productid }</td>
		<td>${product.productname }</td>
		<td>${product.price }</td>
		<td>${product.quantity }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>