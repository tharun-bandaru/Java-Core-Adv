package com.tcs;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConn {

	public static Connection createConnection() {
		Connection connection = null; 
		try {
			// load the properties file
			Properties properties = new Properties();
			properties.load(new FileInputStream("abc.properties"));
			
			//read the data from properties file 
			Class.forName(properties.getProperty("driver"));
			
			connection = DriverManager.getConnection(properties.getProperty("url"),
					properties.getProperty("username"),properties.getProperty("password"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}