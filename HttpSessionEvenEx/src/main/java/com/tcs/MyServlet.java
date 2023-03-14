package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public MyServlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  

        String name = request.getParameter("username");  
        out.print("Welcome "+name);  
        
        HttpSession session = request.getSession();
        
        ServletContext context = request.getServletContext();
        
        int total = (Integer)context.getAttribute("totalusers");  
        int current = (Integer)context.getAttribute("currentusers");  
        out.print("<br>total users= "+total);  
        out.print("<br>current users= "+current);  

        out.print("<br><a href='LogoutServlet'>logout</a>");  
	}
}
