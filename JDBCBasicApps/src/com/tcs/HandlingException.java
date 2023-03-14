package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class loaded successfully.......");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tharun123");
			System.out.println("connection created successfully.....");
			statement=connection.createStatement();
			
			
			//drop table query
			//int x=statement.executeUpdate("drop table emp");
			//System.out.println("table dropped"+x);
			
			
			
			//delete query
			/*int x=statement.executeUpdate("delete from emp where esal>1500");
			System.out.println("delete query executed....."+x);*/
			
			
			
			//update Query
			
			//statement.executeUpdate("update emp set esal=esal+500");
			
			//inserting data
		
			statement.executeUpdate("insert into emp values(2,'sai',3000)");
			statement.executeUpdate("insert into emp values(3,'sir',4000)");
			System.out.println("Data inserted........");
			
			
			
			
			
			
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(statement!=null)
				try {
					statement.cancel();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		}

	}

}
