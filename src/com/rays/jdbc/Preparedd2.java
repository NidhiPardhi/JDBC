package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedd2 {
	public static void main(String[] args) throws Exception {
		testUpdate();

	}

	private static void testUpdate() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		PreparedStatement ps = conn
				.prepareStatement("UPDATE EMPLOYEE SET FNAME = ?, LNAME = ?, SALARY = ?, DEPT_ID = ? WHERE ID = ?");

		ps.setString(1, "RIYA");
		ps.setString(2, "SEN");
		ps.setInt(3, 56000);
		ps.setInt(4, 5);
		ps.setInt(5, 11);

		int i = ps.executeUpdate();

		ps.close();
		conn.close();

	}
}
