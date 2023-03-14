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
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String name=request.getParameter("username");
		String age=request.getParameter("age");
		String addr=request.getParameter("addr");
		
		writer.println("<html><body bgcolor='pink'>");
		writer.println("user name: "+name+"<br>");
		writer.println("user age: "+age+"<br>");
		writer.println("user address: "+addr+"<br>");
		writer.println("</body></html>");
	}

}
