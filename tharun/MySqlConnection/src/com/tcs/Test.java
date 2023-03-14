package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tharun", "root", "root");
		System.out.println("Connection created successfully....with mysql");
		
		Statement statement=connection.createStatement();
		int x = statement.executeUpdate("create table emp(eid int primary key,ename varchar(40),esal float)");
	   System.out.println("table created successfully"+x);
	   int i1=statement.executeUpdate("insert into emp values(1,'ram',1000.23)");
	   int i2=statement.executeUpdate("insert into emp values(2,'rama',2000.23)");
	   int i3=statement.executeUpdate("insert into emp values(3,'sai',3000.23)");	   
	   System.out.println("records inserted successfully"+i1+" "+i2+" "+i3);
	   
	   ResultSet set=statement.executeQuery("select * from emp");
	   while(set.next())
	   {
		   System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
	   }
		connection.close();

	}

}
