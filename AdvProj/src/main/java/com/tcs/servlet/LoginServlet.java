package com.tcs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String status = UserDao.loginCheck(username, password);
		if (status.equals("sucess")) {
			// login sucess :: click here to open the FB

			writer.println("Your login is success : <a href='http://www.fb.com'>click here to get the facebook</a>");

		} else {
			// login Fail : try with valid credentaion
			// include the same login form....
			writer.println(
					"Your login is Fail try one more time : <a href='login.html'>click here to open login form</a>");

		}
	}

}

