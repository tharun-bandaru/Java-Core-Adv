package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CheckServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String location=request.getParameter("location");
		if(age<18)
		{
			writer.println("<font align='center' color='blue'><h1>you are a kid</h1></font>");
		}
		else if(age >18 && age<30) {
			
		   response.sendRedirect("https://www.shaadi.com");
		}
		else if(age >30 && age<70) {
			
			  writer.println("you are old man<a href='old.html'>Click here to join Old age Home</a>");
		}
		else {
			writer.println("");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
