<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="checkservlet">
		Role :<select name="rolename" class="hello">
			<option value="admin">Admin</option>
			<option value="teacher">Teacher</option>
			<option value="hod">HOD</option>
			<option value="4" selected="selected">none</option>
		</select> <br> Name :<input type="text" name="email"> <br>
		Password :<input type="text" name="password"> <input
			type="submit" value="submit">
	</form>
</body>
</html>