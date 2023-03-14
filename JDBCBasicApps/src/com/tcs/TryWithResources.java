package com.tcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResources {

	public static void main(String[] args) {
		
	
		Connection connection=null;
		Statement statement=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class loaded successfully.......");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tharun123");
			System.out.println("connection created successfully.....");
			statement=connection.createStatement();
			 ResultSet set = statement.executeQuery("select * from emp");
			while(set.next())
			{	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));
			}
		}
		catch(SQLException | ClassNotFoundException e)
		{	e.printStackTrace();
		}
		finally {
			try{
				if(statement!=null)  statement.close();
				if(connection!=null) connection.close();
			}
			catch(SQLException e)
			{	e.printStackTrace();
			}	
	}
	}
}
