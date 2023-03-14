package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LocationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
	    ServletConfig config=this.getServletConfig();
	   
	    writer.println("location1"+config.getInitParameter("location1")+"<br><br>");
	    writer.println("location2"+config.getInitParameter("location2")+"<br><br>");
	    ServletContext context=request.getServletContext();
	    writer.println("company ceo"+context.getInitParameter("ceo")+"<br><br>");
	    writer.println("compnay manager"+context.getInitParameter("manager")+"<br><br>");
	}

	

}
