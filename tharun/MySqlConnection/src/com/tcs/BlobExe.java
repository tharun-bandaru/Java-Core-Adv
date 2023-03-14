package com.tcs;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

public class BlobExe {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tharun", "root", "root");
		System.out.println("Connection created successfully....with mysql");
		
		PreparedStatement preparedStatement=connection.prepareStatement("select image,resume from emp where name=?");
		preparedStatement.setString(1,"tharun");
		
		Resultset set=(Resultset) preparedStatement.executeQuery();
	    ((ResultSet) set).next();
	    
	    InputStream inputStream=((ResultSet) set).getBinaryStream(1);
	    FileOutputStream outputStream=new FileOutputStream("newTharun.jpg");
	    
	    int b;
	    while((b=inputStream.read())!=-1)
	    {
	    	outputStream.write(b);
	    }
	    System.out.println("Your image reading completed......");
	    
	    Reader reader=((ResultSet) set).getCharacterStream(2);
	    FileWriter writer=new FileWriter("newResume.txt");
	    
	    int c;
	    while((c=inputStream.read())!=-1)
	    {
	    	writer.write(c);
	    }
	    System.out.println("Your text reading completed......");
	    
	    inputStream.close();
	    reader.close();
	    writer.close();
	    outputStream.close();
	    preparedStatement.close();
	    connection.close();
	    
	    System.out.println("Resources released successfullyy");
	    
		
		
		
		
		
		
		
	}

}
