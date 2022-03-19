<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
	<%-- JSP Comment --%>
	<%-- <%= Expression Tag --%>
	<%--  <% scriptlet Tag  --%>
	<%-- <%@  Directive Tag --%>

	<marquee>
		<%=new Date()%>
	</marquee>

	<form action="checkLogin.jsp" method="post">
		<table align="center">
			<tbody>
				<tr>
					<td>Username :</td>
					<td><input type="text" name="username" required="required">
					</td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="pwd" required="required">
					</td>
				</tr>
				<tr>
					<td><input type="reset" value="Clear"></td>
					<td align="center"><input type="submit" value="Login"></td>
				</tr>
			</tbody>
		</table>
	</form>

</body>
</html>