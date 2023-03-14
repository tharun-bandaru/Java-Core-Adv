package com.tcs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public MyListener() {
	}

	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("contextDestroyed method Connection closed");
		ServletContext context = event.getServletContext();
		Connection connection = (Connection) context.getAttribute("conn");
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void contextInitialized(ServletContextEvent event) {
		System.out.println("contextInitialized method Connection creation");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
			System.out.println("driver loaded successfully....");
			ServletContext context = event.getServletContext();
			context.setAttribute("conn", connection);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}