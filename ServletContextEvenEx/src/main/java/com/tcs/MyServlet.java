package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.print("what's happening");
		String tname  = request.getParameter("tname");
		

		ServletContext context =  request.getServletContext();
		Connection connection = (Connection) context.getAttribute("conn");
		
		try {
			Statement statement = connection.createStatement();
			ResultSet set =  statement.executeQuery("select * from "+tname);
			while(set.next())
			{	writer.println(set.getInt(1)+" "+set.getString(2)+" "+set.getDouble(3));
				writer.println("<br><br>");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
