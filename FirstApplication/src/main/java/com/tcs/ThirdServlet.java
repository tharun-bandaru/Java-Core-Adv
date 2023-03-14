package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ThirdServlet() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<br>Third Servlet approach get() request method");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter writer=response.getWriter();
	writer.println("Third approach do post is executed");
	
	}
}
