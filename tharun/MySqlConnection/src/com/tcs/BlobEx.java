package com.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobEx {

	public static void main(String[] args)throws Exception {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tharun", "root", "root");
		System.out.println("Connection created successfully....with mysql database");
		File imgFile=new File("tharun.jpg");
		FileInputStream inputStream=new FileInputStream(imgFile);
		
		File txtFile=new File("abc.txt");
		FileReader reader=new FileReader(txtFile);
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?,?)");
		preparedStatement.setInt(1, 111);
		preparedStatement.setString(2, "tharun");
		preparedStatement.setBinaryStream(3, inputStream, imgFile.length());
		preparedStatement.setCharacterStream(4, reader,txtFile.length());
		boolean x=preparedStatement.execute();
		System.out.println("Data inserted successfully"+x);
		
		
		
		
		reader.close();
		inputStream.close();
		
		connection.close();
		
	}

}
