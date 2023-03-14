package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		ServletConfig config=this.getServletConfig();
		ServletContext context=this.getServletContext();
		writer.println("First Servlet init param 1 "+config.getInitParameter("username")+" "+config.getInitParameter("password"));
		writer.println("<br><br>");
		
		writer.println("First Servlet init param 2 "+context.getInitParameter("roi")+" "+context.getInitParameter("loan"));
		writer.println("<br><br>");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
