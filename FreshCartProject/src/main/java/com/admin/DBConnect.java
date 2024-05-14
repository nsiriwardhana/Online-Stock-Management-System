package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	//create database connection
	private static String url = "jdbc:mysql://localhost:3306/freshcart";
	private static String user = "root";
	private static String pass = "OOPprojecty2s1";
	
	private static Connection con ;
	
	public static Connection getConnection() {
		try {
			Class.forName("con.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
		
		}
		catch(Exception e) {
			System.out.println("Database connection is not success !!!");
		}
		
		return con;
		
	}

}
