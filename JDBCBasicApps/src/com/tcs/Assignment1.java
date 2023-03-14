package com.tcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Assignment1 {
	public static void main(String args[])
	{
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class loaded successfully....");
			
		    connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
		    
		    statement=connection.createStatement();
		    statement.execute("create table student(sid number,sname varchar2(20),smarks number)");
		   System.out.println("table create successfully");
		    
		    //insert data
		    statement.execute("insert into student values(1,'ram',98)");
		    statement.execute("insert into student values(2,'tharun',99)");
		    statement.execute("insert into student values(3,'sai',30)");
		    statement.execute("insert into student values(4,'sam',33)");
		    System.out.println("Data inserted succesfully......"); 
		    
		    
		    //printing data
		    System.out.println("Data printed Successfully........");
		    ResultSet set=statement.executeQuery("select * from student");
		    while(set.next())
		    {
		    	System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getInt(3));
		    }
		    
		    
		    
		    
		  //update record
		    statement.execute("update student set smarks=smarks+2 where smarks>30");
		   System.out.println("data updated successfully.....");
		    
		    
		 
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if (connection!=null) { connection.close();}
				if (statement!=null)  { statement.close();}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
