<%@page import="Bean.Getter_Setter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="Bean.UserDao" %>
<%
String name=request.getParameter("name");
Getter_Setter e= UserDao.getRecordbyName(name);

%>
<h1>Edit Form</h1>
<form action="Edituser2.jsp">
<table>
<tr><td><input type="hidden"  name="name" value=<%=e.getName() %>></td></tr>
<tr><td>Password</td><td><input type="text" name="password" value=<%=e.getPassword() %>></td></tr>
<tr><td>Email</td><td><input type="text" name="email" value=<%=e.getEmail() %>></td></tr>
<tr><td><input type="submit" value="Edit&save">



</table>



</form>




</body>
</html>