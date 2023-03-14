package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String uname=request.getParameter("uname");
		String uage=request.getParameter("uage");
		String uadr=request.getParameter("uadr");
		
		writer.println("********U r Registration Success**********");
		writer.println("<br>");
		writer.println("User Name= "+uname);
		writer.println("<br>");
		writer.println("User Age= "+uage);
		writer.println("<br>");
		writer.println("User Address= "+uadr);
		
		writer.println("we will fin the girl for marriage");
	}

}
