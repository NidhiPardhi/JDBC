package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD2 {

	public static void main(String[] args) throws Exception {
		 testAdd();
		 
	}
		private static void testAdd() throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
	
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES (11,'RIYA','SINHA',12000,6)");

	    System.out.println(i+" Insert");
	    
	    stmt.close();
	    conn.close();

	}

}
