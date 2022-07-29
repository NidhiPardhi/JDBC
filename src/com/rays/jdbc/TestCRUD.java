package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD {

	public static void main(String[] args) throws Exception {
		testSelect();
	}
	
		private static void testSelect() throws Exception {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("select * from employee");

		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.println("\t" + rs.getInt(5));
		}

	}

}
