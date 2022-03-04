package com.revature.project0.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.project0.beans.User;
import com.revature.project0.util.DBUtil;

public class UserServiceImpl implements UserService {

	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public UserServiceImpl() {
		conn = DBUtil.getConnection();
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		String query = "select * from p0_user where username=? and password=?";
		boolean status = false;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next())
				status = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		String query = "insert into p0_user (first_name,last_name,username,password,user_type ) values (?,?,?,?,?)";
		boolean status = false;
		int insertStatus = 0;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getLastName());
			pstmt.setString(3, user.getUsername());
			pstmt.setString(4, user.getPassword());
			pstmt.setString(5, user.getUserType());
			insertStatus = pstmt.executeUpdate();
			if (insertStatus > 0)
				status = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

}
