package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class utility {
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3307/demo_database","root","");  
			
	
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connection did not find");
		}
		return con;
		
		
	}

}
