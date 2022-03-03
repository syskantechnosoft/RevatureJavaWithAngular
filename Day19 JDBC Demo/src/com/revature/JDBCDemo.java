package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Step 1: Loading & Registering the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		String dbUrl = "jdbc:mysql://localhost:3306/revature";
		String username = "root";
		String password = "root"; //Change it if needed
		// Step 2: Establishing the connection to the DB Server
		Connection conn = DriverManager.getConnection(dbUrl, username, password);

		// Step 3: Creating & Running the Queries
		String query = "select * from employee";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		// Step 4: Processing the Result
		System.out.println("Employee Table Content");
		System.out.println("ID \t Name \t\t Email ");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getString("email"));
		}
		
		//Step 5: closing Resources
		if (rs!= null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}

}
