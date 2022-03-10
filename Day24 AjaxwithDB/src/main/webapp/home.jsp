<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
	String username = request.getParameter("uname");
		String password = request.getParameter("pwd");

		if (username == null || username.trim().equals("")) {
			out.print("Please enter id");
		} else {
	// 		int id = Integer.parseInt(s);
	// 		out.print(id);
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from consumer where username=? and password=?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			//out.print(rs.getInt(1) + " " + rs.getString(2));
			out.print("Login Successful!!!");
		} else {
			out.print("Invalid credentials!!! Pls try again....");
		}
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	%>
</body>
</html>