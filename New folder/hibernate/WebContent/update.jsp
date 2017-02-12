<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateemp" method="post">
ID :<input type="text" name="id" value="${h.id}" readonly="readonly">
<br>
Name :<input type="text" name="name" value="${h.name}">
<br>
Password :<input type="password" name="password" value="${h.password}">
<br>
Email :<input type="text" name="email" value="${h.email}">
<input type="submit" value="update">




</form>
<a href="viewdata.jsp">view data</a>


</body>
</html>