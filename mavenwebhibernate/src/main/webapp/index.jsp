<%@page import="com.revature.project.dao.UserDAO"%>
<%@page import="com.revature.project.service.UserService"%>
<%@page import="com.revature.project.bean.Users"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome to Employee Reimbursement System</h1>
	<%=new Date(122, 02, 18)%>

	<%
	UserService userService = new UserService();
	UserDAO userDAO = new UserDAO();
	userService.setUserDao(userDAO);
	List<Users> list = userService.getAllUsers();
	request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Email</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getUsername()}</td>
				<td>${u.getPassword()}</td>
				<td>${u.getEmail()}</td>
				<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>
				<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="adduserform.jsp">Add New User</a>

</body>
</html>