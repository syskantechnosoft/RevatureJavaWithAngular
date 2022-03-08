package com.revature.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Singleton utility for creating and retrieving database connection
 */
public class ConnectionUtil {
	private static ConnectionUtil cu = null;
	private static Properties prop;
	private static Connection conn;
	private static String url = null;// = "jdbc:mysql://localhost:3306/p0";
	private static String username = null;
	private static String password = null;

	/**
	 * This method should read in the "database.properties" file and load the values
	 * into the Properties variable
	 */
	private ConnectionUtil() {
		
	}

	public static synchronized ConnectionUtil getConnectionUtil() {
		if (cu == null)
			cu = new ConnectionUtil();
		return cu;
	}

	/**
	 * This method should create and return a Connection object
	 * 
	 * @return a Connection to the database
	 */
	public static Connection getConnection() {
		// Hint: use the Properties variable to setup your Connection object
		Properties properties = new Properties();
		try {
			FileInputStream fileStream = new FileInputStream("src/main/resources/database.properties");
			properties.load(fileStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		url = properties.getProperty("url");
		password = properties.getProperty("pswd");
		username = properties.getProperty("usr");
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
