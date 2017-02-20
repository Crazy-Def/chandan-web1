<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="role.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form  action="saveservlet" method="post" class="hey">
<fieldset class="johny"  >
<legend>Student Database</legend>
			Role :<select name="rolename" class="hello">
				<option value="admin">Admin</option>
				<option value="teacher">Teacher</option>
				<option value="hod">HOD</option>
				<option value="4" selected="selected">none</option>
			</select>
			<hr>

S-Name :<input type="text" name="sname" style="float: right;padding-right: 5px">
<hr>
Age :<input type="text" name="age" style="float: right;padding-right: 5px">
<hr>
Email :<input type="text" name="email" style="float: right;padding-right: 5px">
<hr>
Password :<input type="text" name="password" style="float: right;padding-right: 5px">
<hr>
<input type="submit" value="submit" style="float: left;padding-left: 20pxpx">
</fieldset>
</form>

</body>
</html>