package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preparedd {
	 public static void main(String[] args) throws Exception {
		 testAdd();
		 
	 }
			
			private static void testAdd() throws Exception {
				
		    Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
			
			PreparedStatement ps=conn.prepareStatement("INSERT INTO EMPLOYEE VALUES (?,?,?,?,?)");
				  
			ps.setInt(1, 11);
			ps.setString(2,"Simmi");
			ps.setString(3,"sinha");
			ps.setInt(4, 123456);
			ps.setInt(5,7 );
			
			int i= ps.executeUpdate();

		   ps.close();
		   conn.close();
		
	}
} 
		
	


