package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Preparedd4 {
	 public static void main(String[] args) throws Exception {
		 testSelect();
		 
	 }
			
			private static void testSelect() throws Exception {
				
		    Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/rays", "root", "root");
			
			PreparedStatement ps=conn.prepareStatement("SELECT * FROM EMPLOYEE ");
			
			ResultSet rs= ps.executeQuery();
				  
			while (rs.next()) {

				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getString(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.println("\t" + rs.getInt(5));
			}

			

		   ps.close();
		   conn.close();
		
	}
} 
		
	


