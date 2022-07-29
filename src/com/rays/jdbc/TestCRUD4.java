package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD4 {

	public static void main(String[] args) throws Exception {
		 testDelete();
		 
	}
		private static void testDelete() throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
	
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE ID=11");

	    System.out.println(i+" DELETE");
	    
	    stmt.close();
	    conn.close();

	}

}
