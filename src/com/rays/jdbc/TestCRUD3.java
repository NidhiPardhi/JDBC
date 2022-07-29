package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestCRUD3 {

	public static void main(String[] args) throws Exception {
		 testUpdate();
		 
	}
		private static void testUpdate() throws Exception {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
	
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");

		Statement stmt = conn.createStatement();

		int i = stmt.executeUpdate("UPDATE EMPLOYEE SET FNAME='PRIYA',LNAME='TIWARI',SALARY=30000,DEPT_ID=4 WHERE ID=11");

	    System.out.println(i+" Insert");
	    
	    stmt.close();
	    conn.close();

	}

}
