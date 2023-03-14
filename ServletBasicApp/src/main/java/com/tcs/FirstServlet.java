package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet implements Servlet {

    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init-method");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy-method");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("serveice-method");
		response.setContentType("text/html");
	    PrintWriter writer=response.getWriter();
	    writer.println("This is my first application");
	}

}
