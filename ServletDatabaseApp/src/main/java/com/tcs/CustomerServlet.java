package com.tcs;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerServlet() {
	}
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String firstname=request.getParameter("firstName");
		String lastname=request.getParameter("lastName");
		
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		
		String[] addr=request.getParameterValues("t1");
		StringBuffer buffer=new StringBuffer();
		for(String data:addr)
		{
			buffer.append(data+",");
		}
		String caddr=buffer.toString();
		
		try {
			
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
        Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tharun123");
			
			
		PreparedStatement preparedStatement=connection.prepareStatement("insert into customer values(?,?,?,?,?)");
		preparedStatement.setString(1, firstname);
		preparedStatement.setString(2,lastname);
		preparedStatement.setString(3, mobile);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, caddr);
		int a=preparedStatement.executeUpdate();
			
		if(a==1)
			{
			 writer.println("Data Inserted Successfully.....<br><br>");
			 writer.println("<a href='DisplayServlet'>Click here to display all the deatails......</a>");
		    }
     	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
