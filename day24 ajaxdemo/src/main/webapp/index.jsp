<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index.jsp</title>
</head>
<body>
	<%
	int n = Integer.parseInt(request.getParameter("val"));

	for (int i = 1; i <= 10; i++)
		out.print(i * n + "<br>");
	%>
</body>
</html>