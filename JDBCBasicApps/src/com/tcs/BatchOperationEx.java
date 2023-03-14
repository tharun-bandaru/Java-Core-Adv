package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchOperationEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
		System.out.println("Connection created successfully......"+connection);
		
		Statement statement=connection.createStatement();
		statement.addBatch("create table emp2(eid number,ename varchar2(20),esal number)");
		statement.addBatch("insert into emp2 values(111,'ratan',1000.45)");
		statement.addBatch("insert into emp2 values(222,'anu',2000.45)");
		statement.addBatch("insert into emp2 values(333,'sravya',3000.45)");
		statement.addBatch("update emp2 set esal=esal+500 where esal>1000.45");
		
		int a[]=statement.executeBatch();
		for(int x:a) {
			
		  System.out.println(x);
		}
		statement.close();
	    connection.close();
	    
		
	}

}
