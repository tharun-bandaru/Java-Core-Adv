package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStmtEx1 {

	public static void main(String[] args)throws Exception {
	
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
	     System.out.println("Connection created successfully....");
	     
		connection.close();

	}

}
