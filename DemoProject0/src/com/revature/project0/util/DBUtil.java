package com.revature.project0.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String url = "jdbc:mysql://localhost:3306/revature1";
	private static String dbusername = "root";
	private static String dbpassword = "root";
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url,dbusername,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
