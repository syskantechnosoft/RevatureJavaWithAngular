<%@page import="com.revature.project.dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<jsp:useBean id="u" class="com.revature.project.bean.Users"></jsp:useBean>
	<jsp:setProperty property="*" name="u" />
	<%
	new UserDAO().updateUser(u);
	response.sendRedirect("index.jsp");
	%>
</body>
</html>