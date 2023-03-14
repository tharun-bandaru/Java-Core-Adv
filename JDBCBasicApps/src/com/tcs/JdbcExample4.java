
package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExample4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
		System.out.println("Connection created successfully......"+connection);
		
		Statement statement = connection.createStatement();
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter emp id..");
			int eid = scanner.nextInt();
			
			System.out.println("Enter emp name..");
			String ename = scanner.next();
			
			System.out.println("Enter emp sal..");
			double esal = scanner.nextDouble();
		
			statement.executeUpdate("insert into emp values("+eid+",'"+ename+"',"+esal+")");
			System.out.println("data inserted sucessfully...do you want insert one more record(yes/no)");
			String option = scanner.next();
			if(option.equals("no"))
				break;
		}
		
		scanner.close();
		statement.close();
		connection.close();
		System.out.println("Resources are released......");
	}
}
