package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EmailServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
	    ServletConfig config=this.getServletConfig();
	    ServletContext context=request.getServletContext();
	    writer.println("email1"+config.getInitParameter("email1"));
	    writer.println("email2"+config.getInitParameter("email2"));
	    writer.println("company ceo"+context.getInitParameter("ceo"));
	    writer.println("compnay manager"+context.getInitParameter("manager"));
	}


}
