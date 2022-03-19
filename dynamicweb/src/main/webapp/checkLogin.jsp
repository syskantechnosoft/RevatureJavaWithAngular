<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validate Login</title>
</head>
<body>
	<sql:setDataSource var="conn" user="root" password="root"
		driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/p1" />

	<sql:query dataSource="${conn}" var="rs">select * from users where username='${param.username}' and password='${param.pwd}';</sql:query>

	<c:forEach var="user" items="${rs.rows}">
		<c:out value="Hello ${user.username}, Your Login is Successfull!!!"></c:out>
	</c:forEach>
<%-- 	<c:otherwise> --%>
<%-- 		<c:out value="Error While Loggin In. Pls Check the Credentials!!!"></c:out> --%>
<%-- 	</c:otherwise> --%>

</body>
</html>