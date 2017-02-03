<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="adduserform.jsp">Add users</a>
<%@ page import="Bean.Getter_Setter,Bean.UserDao,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
List<Getter_Setter> list=UserDao.getAllEmployess();
request.setAttribute("l", list);
%>
<table style="border: thin ;size: 1px;border-style: solid;">
<tr><th>Name</th><th>Password</th><th>Email</th></tr>
<c:forEach items="${l}" var="a">
<tr><td style="border: thin;padding: 1px;border-style: solid;">${a.getName()}</td><td style="border: thin;padding: 1px;border-style: solid;">${a.getPassword()}</td><td style="border: thin;padding: 1px;border-style: solid;">${a.getEmail()}</td><td style="border: thin;padding: 1px;border-style: solid;"><a href="Edituser.jsp?name=${a.getName()}">Edit</td><td style="border: thin;padding: 1px;border-style: solid;"><a href="Delete.jsp?name=${a.getName()}">Delete</a></tr>
</c:forEach>
</table>

</body>
</html>