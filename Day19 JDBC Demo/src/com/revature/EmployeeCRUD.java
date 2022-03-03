package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.beans.Employee;

public class EmployeeCRUD {

	private static Connection conn;
	private static Statement stmt;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Employee getEmployee(int id) {
		getConnection();
		String query = "select * from employee where id=" + id;
		Employee emp = new Employee();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			if (rs.next()) {
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	public static List<Employee> getEmployees() {
		getConnection();
		List<Employee> employeeList = new ArrayList<Employee>();
		String query = "select * from employee";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				employeeList.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	public static void addEmployee(Employee emp) {
		getConnection();
		String query = "insert into employee (name,email) values (?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void editEmployee(int id, Employee emp) {
		getConnection();
		String query = "update employee set name=?, email =? where id=?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(3, id);
			pstmt.setString(1, emp.getName());
			pstmt.setString(2, emp.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void deleteEmployee(int id) {
		getConnection();
		String query = "delete from employee where id=" + id;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void closeResource() {

		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);
		int id = 0;
		String name = null;
		String email = null;
		Employee emp = null;
		while (choice <= 5) {

			// TODO Auto-generated method stub
			System.out.println("\t\t 1. View Employees");
			System.out.println("\t\t 2. Add Employee");
			System.out.println("\t\t 3. Edit Employee");
			System.out.println("\t\t 4. Delete Employee");
			System.out.println("\t\t 5. Exit");
			System.out.print("Enter your choice [1-5] :");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(getEmployees());
				break;

			case 2:
				System.out.print("Enter Employee Name :");
				name = input.next();
				System.out.print("Enter Employee Email :");
				email = input.next();
				emp = new Employee(name, email);
				addEmployee(emp);
				break;
			case 3:
				System.out.print("Enter Employee ID to Edit :");
				id = input.nextInt();
				System.out.print("Enter Employee Name to Update:");
				name = input.next();
				System.out.print("Enter Employee Email to Update:");
				email = input.next();
				emp = new Employee(name, email);
				editEmployee(id, emp);
				break;

			case 4:
				System.out.print("Enter Employee ID to Delete :");
				id = input.nextInt();
				deleteEmployee(id);
				break;

			case 5:
				System.out.println("Thanks for using Employee CRUD!!!");

				break;

			default:
				System.out.println("Enter any valid number between 1 to 5");
				break;
			}
		}

		closeResource();
		input.close();
	}

}
