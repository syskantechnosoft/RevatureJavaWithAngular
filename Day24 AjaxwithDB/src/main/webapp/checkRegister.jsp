<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Register</title>
</head>
<body>
<!-- 	<a href="login.jsp">Login</a> &nbsp;&nbsp; -->
<!-- 	<a href="register.html">Register</a> -->
	<%
	String email = request.getParameter("email");
	// 	String username = request.getParameter("uname");
	// 	String password = request.getParameter("pwd");
	// 	String name = request.getParameter("name");
		
	// 	long mobile = Long.parseLong(request.getParameter("mobile"));

		if (email == null || email.trim().equals("")) {
			out.print("Please enter email ID :");
		} else {
			// 		int id = Integer.parseInt(s);
			// 		out.print(id);
			try {

		int status = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from consumer where email=?");
		ps.setString(1, email);
		//ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			//out.print(rs.getInt(1) + " " + rs.getString(2));
			out.print("User already Registered!!!");
		} else {
			out.print("User not Registered!!!");
			//out.print("Invalid credentials!!! Pls try again....");
			//ps = con.prepareStatement("insert into consumer (name,email,mobile,username,password) values (?,?,?,?,?)");
	// 		ps.setString(1, name);
	// 		ps.setString(2, email);
	// 		ps.setLong(3, mobile);
	// 		ps.setString(4, username);
	// 		ps.setString(5, password);
		//status = ps.executeUpdate();

	if (status > 0) {
		out.print("User Successfully registered!!!");
	}
	}
	con.close();
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	%>
</body>
</html>