package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample1{
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		//step1: load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("class loaded successfully...");
		
		//step2: create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tharun123");
		System.out.println("connection created successfully"+connection);
		
		//step3: write the query
		String q1="create table emp2(ename varchar2(20),eid number,esal number)";
		System.out.println("connection create succesfully....."+connection);
		
		//step4: Process the query
		Statement statement=connection.createStatement();
		int x=statement.executeUpdate(q1);
		System.out.println("Table created succesffuly..."+x);
		
		//step5: close the resources
		statement.close();
		connection.close();
		System.out.println("connection closed succesfully");
		
	}
}