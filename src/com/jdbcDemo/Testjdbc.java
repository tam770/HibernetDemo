package com.jdbcDemo;

import java.sql.*;

public class Testjdbc {
	
	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/mysql1";
	    String user="root";
	    String password="tamtam";
		try {
			System.out.println("hi");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("connection build");
			System.out.println(con);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
