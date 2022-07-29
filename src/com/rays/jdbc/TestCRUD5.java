package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD5 {

	public static void main(String[] args) throws Exception {
		 testGetById();
		 
	}
		private static void testGetById() throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
	
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT id, fname,lname,salary,dept_id FROM EMPLOYEE WHERE ID=5");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		}
	   
	    stmt.close();
	    conn.close();

	}

}
