<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.pojo.*" %>
    <%@ page import="com.model.*" %>
    <%@ page import="com.common.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
BLManager bl=new BLManager();
response.setContentType("text/html");
List<Hiber> list=bl.getallemp();
request.setAttribute("list1", list);


%>
<table border="2px">
<tr>
	<td>ID</td>
	<td>Name</td>
	<td>Password</td>
	<td>Email</td>
	<td>Edit</td>
	<td>Delete</td>
</tr>
<c:forEach items="${list1}" var="l">
<tr>
	<td>${l.id}</td>
	<td>${l.name}</td>
	<td>${l.password}</td>
	<td>${l.email}</td>
	<td><a href="updateemp?id=${l.id}">edit</a>
	<td><a href="deletedata?id=${l.id}">Delete</a>
</tr>
</c:forEach>
</table>
<a href="index.jsp">Add data</a>
</body>
</html>