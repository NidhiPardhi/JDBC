package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedd3 {
	public static void main(String[] args) throws Exception {
		testDelete();

	}

	private static void testDelete() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		PreparedStatement ps = conn.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");

		ps.setInt(1, 11);

		int i = ps.executeUpdate();

		System.out.println("deleted = " + i);

		ps.close();
		conn.close();

	}
}
