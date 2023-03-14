package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
	   System.out.println("Connection creatd successfully...."+connection);
	   
	   PreparedStatement preparedStatement=connection.prepareStatement("update emp set esal=esal+? where esal>=? ");
	   
	   preparedStatement.setInt(1, 500);
	   preparedStatement.setInt(2, 2000);
	   
	   int x=preparedStatement.executeUpdate();
	   System.out.println("rows count updated..."+x);
	   
	   preparedStatement.close();
	   connection.close();
	   System.out.println("resources are released......");
	   

	}

}
