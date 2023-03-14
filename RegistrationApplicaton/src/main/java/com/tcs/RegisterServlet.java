package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	    PrintWriter writer=response.getWriter();
	    String username=request.getParameter("user");
	    String password=request.getParameter("password");
	    String[] qualf=request.getParameterValues("qual");
	    String gender=request.getParameter("gender");
	    String[] technologies=request.getParameterValues("technologies");
	    String country=request.getParameter("country");
	    String[] addr=request.getParameterValues("addr");
	    String[] comments=request.getParameterValues("review");
	    writer.println("<html>");
	    writer.println("<body color='pink'>");
	    writer.println("username"+username+"<br>");
	    writer.println("password"+password+"<br>");
	    writer.println("qualfication"+"<br>");
	    for(String q:qualf)
	    {
	    	writer.println(q);
	    }
	    writer.println("gender"+gender+"<br>"+"<br>"+"<br>");
	    writer.println("Technologies...........");
	    for(String t:technologies)
	    {
	    	writer.println(t);
	    }
	    
	    writer.println("<br>"+"country<br>"+country);
	    writer.println("comments...");
	    //writer.println()
	    for(String t:comments)
	    {
	    	writer.println(t);
	    }
	    writer.println("</body>");
	    writer.println("</html>");
	}

}
