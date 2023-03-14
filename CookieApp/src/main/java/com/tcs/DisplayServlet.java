package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
	
		
		
		Cookie[] cookies=request.getCookies();
		writer.println("username...."+cookies[0].getValue()+"<br>");
		writer.println("user age...."+cookies[1].getValue()+"<br>");
		writer.println("user qualf...."+cookies[2].getValue()+"<br>");
		writer.println("user designation...."+cookies[3].getValue()+"<br>");
		writer.println("user email..."+request.getParameter("uemail"));
		writer.println("user mobile..."+request.getParameter("umob"));
	}

}
