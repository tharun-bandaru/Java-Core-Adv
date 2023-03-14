package com.tcs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResetPassword")
public class ResetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ResetPassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");

		if(password.equals(confirmpassword)) {
		   boolean status= UserDao.resetPassword(username,password);
		   if(status) {
				   writer.println("<html><body><p style='color:red'><center>your password reset/change  successfully</p></center></body></html>");

		   }
		   else {
				   writer.println("<html><body><p style='color:red'><center>you entered wrong username</center></p></body></html>");
		   }
		}
		else
		{writer.println("<html><body><p style='color:red'><center>you entered password & confirm password wrong</center></p></body></html>");
		}
	}
}

