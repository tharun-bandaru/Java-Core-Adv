package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Example1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1: load the driver class
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("class loaded successfully...");
				
		//step2:create the  connection
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
				System.out.println("Connection created successfully "+connection);
				connection.close();
			System.out.println("Resources are released");
	}

}
