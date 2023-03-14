package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcExample6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1: load the driver class
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("class loaded successfully...");
				
				//step2: create the connection
				Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tharun123");
				System.out.println("connection created successfully"+connection);
		PreparedStatement preparedStatement = connection.prepareStatement("update emp set esal=esal+? ");
		
		preparedStatement.setInt(1, 750);
	
		
		int x = preparedStatement.executeUpdate();
		System.out.println("updated records count..."+x);
		
		preparedStatement.close();
		connection.close();
		System.out.println("Resources are released......");
	}
}