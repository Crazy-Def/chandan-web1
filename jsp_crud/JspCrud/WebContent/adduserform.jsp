<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="viewusers.jsp">View All Record</a>
<h1>Add new User</h1>
<form action="adduser.jsp">
<table>
<tr><td>Name</td><td><input type="text" name="name"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td>Email</td><td><input type="text" name="email"></td></tr>
<tr><td colspan="2"><input type="submit" value="ADD" name="submit"></td></tr>
</table>
</form>

</body>
</html>