<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Form</title>
</head>
<body>
<h2>Enter Your Details</h2>
<form action="/webCRUD/insertServlet" method="post">
    <table>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="fname"></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lname"></td>
        </tr>
        <tr>
            <td>Mobile Number:</td>
            <td><input type="text" name="mobile"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form>
</body>
</html>