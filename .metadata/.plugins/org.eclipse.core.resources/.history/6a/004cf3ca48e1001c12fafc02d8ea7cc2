package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DisplayServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
	    HttpSession session=request.getSession(false);
	    writer.println("user name:"+session.getAttribute("uname"));
	    writer.println("<br>");
	    writer.println("user age:"+session.getAttribute("uage"));
	    writer.println("<br>");
	    writer.println("user qualification:"+session.getAttribute("uqual"));
	    writer.println("<br>");
	    
	    writer.println("user designation:"+session.getAttribute("udesig"));
	    writer.println("<br>");
	    
	    writer.println("user email id="+request.getParameter("email"));
	    writer.println("<br>");
	    
	    writer.println("user mobile="+request.getParameter("mobile"));
	    writer.println("<br>");
	    
	    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
