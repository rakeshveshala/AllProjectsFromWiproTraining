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
  <form:form action="insertProduct" modelAttribute="productdata" mrthod="post"> 
  <table> 
         <tr> 
         <td>Product id </td> 
         <td><form:input path="productid"/></td> 
		</tr>
		<tr> 
         <td>Product name </td> 
         <td><form:input path="productname"/></td> 
		</tr> 
		<tr> 
         <td>Product price </td> 
         <td><form:input path="price"/></td>  
		</tr> 
		<tr> 
         <td>Product quantity </td> 
         <td><form:input path="quantity"/></td> 
		</tr> 
		<tr> 
         <td></td> 
         <td><input type="submit" value="click here"/></td> 
		</tr>
  </table> 
  </form:form>
</body>
</html>