package com.tcs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);
		String uqual=request.getParameter("uqual");
		String udesig=request.getParameter("udesig");
		
		session.setAttribute("uqual", uqual);
		session.setAttribute("udesig", udesig);
		
		request.getRequestDispatcher("form3.html").forward(request, response);
}
}
