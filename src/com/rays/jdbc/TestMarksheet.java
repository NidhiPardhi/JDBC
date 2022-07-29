package com.rays.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMarksheet {
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3307/rays","root","root");
		
		Statement sm=c.createStatement();
		
		ResultSet rs= sm.executeQuery(" SELECT ID, ROLLNO ,FNAME, LNAME, PHYSICS, CHEMISTRY, MATHS, (PHYSICS+CHEMISTRY+MATHS) AS TOTAL, (((PHYSICS+CHEMISTRY+MATHS)/3)) AS PERCENTAGE FROM MARKSHEET WHERE PHYSICS > 40 && CHEMISTRY > 40 && MATHS > 40 ORDER BY TOTAL DESC");
		System.out.println("\t"+"ID"+"\t"+"ROLL NO."+"\t"+"FIRST NAME"+"\t"+"LAST NAME"+"\t"+"PHYSICS"+" \t "+"CHEMISTRY"+"\t"+"MATHS"+"\t"+"TOTAL"+"\t"+"PERCENTAGE" );
		System.err.println("______________________________________________________________________________________________________________________________");
		while(rs.next()) {
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t        "+rs.getString(3));
			System.out.print("\t        "+rs.getString(4));
			System.out.print("\t        "+rs.getInt(5));
			System.out.print("\t         "+rs.getInt(6));
			System.out.print("\t        "+rs.getInt(7));
			System.out.print("\t "+rs.getInt(8));
			System.out.println("\t      "+rs.getInt(9));
		}
		rs.close();
		sm.close();
		c.close();
	}

}
