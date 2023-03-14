package com.tcs;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class PropertiesEx1 {

	public static void main(String[] args) throws SQLException {
		Connection connection=TestConn.createConnection();
		System.out.println("Connection done......"+connection);
		
		DatabaseMetaData metaData=connection.getMetaData();
		System.out.println(metaData.getDatabaseProductName());
		
		
		// TODO Auto-generated method stub

	}

}
