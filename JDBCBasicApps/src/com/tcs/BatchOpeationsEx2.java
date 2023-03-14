package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BatchOpeationsEx2 {

	public static void main(String[] args)throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
		System.out.println("Connection created successfully......"+connection);
		
		PreparedStatement preparedStatement=connection.prepareStatement("update emp2 set ename=? where eid=?");
		preparedStatement.setString(1, "ram");
		preparedStatement.setInt(2,111);
		preparedStatement.addBatch();
		
		preparedStatement.setString(1, "anushka");
		preparedStatement.setInt(2,222);
		preparedStatement.addBatch();
		
		preparedStatement.setString(1, "srav");
		preparedStatement.setInt(2,333);
		preparedStatement.addBatch();
		
		preparedStatement.executeBatch();
		preparedStatement.close();
		
		connection.close();
		
	}

}
