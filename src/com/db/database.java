package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
	
	public static Connection getDbObject() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return	DriverManager.getConnection("jdbc:mysql://localhost:3306/quick_bill","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
