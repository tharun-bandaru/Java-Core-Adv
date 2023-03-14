package com.tcs;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public LoginServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		/*
		 * if(username.equals("tharun") && password.equals("sai")) {
		 * response.sendRedirect("http://www.tcs.com"); } else {
		 * writer.println("Login Failed..."); }
		 */		
		
		 if(username.equals("tharun") && password.equals("sai"))
		 {
			 writer.println("This is success");
			 writer.println("That is success");
			 RequestDispatcher dispatcher=request.getRequestDispatcher("SuccessServlet");
			 dispatcher.forward(request, response);
		}
		 else
		 {
			 writer.println("This is Fail");
			 writer.println("That is Fail");
			 RequestDispatcher dispatcher=request.getRequestDispatcher("LoginApp.html");
			 dispatcher.include(request, response);
		 }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
