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
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);
		
		out.println("<html>");
		out.println("<body bgcolor='green'>");
		out.println("user name........"+session.getAttribute("uname")+"<br>");
		out.println("user age........"+session.getAttribute("uage")+"<br>");
		out.println("user qualification........"+session.getAttribute("uqual")+"<br>");
		out.println("user designation........"+session.getAttribute("udesign")+"<br>");
		out.println("Email....."+request.getParameter("uemail")+"<br>");
		out.println("Mobile....."+request.getParameter("umob")+"<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
