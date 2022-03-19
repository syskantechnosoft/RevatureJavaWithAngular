<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users Page</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/p1" user="root" password="root" />

	<sql:query dataSource="${db}" var="rs">SELECT * from users;</sql:query>

	<table border="2" width="100%">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<td><c:out value="${table.id}" /></td>
				<td><c:out value="${table.username}" /></td>
				<td><c:out value="${table.email}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>