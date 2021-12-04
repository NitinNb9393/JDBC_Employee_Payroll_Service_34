package com.bridgelabz.JDBC_Employee_Payroll_Service;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeConfig {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/payroll_service";
		String username = "root";
		String password = "root";
		try {
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connected to database");
		} catch (SQLException e) {
			System.out.println("ops,error!");
			e.printStackTrace();
		}

	}
}