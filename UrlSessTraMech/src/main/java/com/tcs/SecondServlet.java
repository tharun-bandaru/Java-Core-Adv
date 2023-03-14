package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

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
	
		String uqual=request.getParameter("uqual");
		String udes=request.getParameter("udes");
		
		HttpSession session=request.getSession(false);
		
		session.setAttribute("uqual", uqual);
		session.setAttribute("udes", udes);
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<form method='get' action="+response.encodeURL("./DisplayServlet")+">");
		writer.println("<br>");
		writer.println("user email: <input type='text' name='email'/>");
		writer.println("<br>");
		writer.println("user mobile: <input type='text' name='mobile'/>");
		writer.println("<br>");
		writer.println("<input type='submit' value='display'/>");
		writer.println("</form>");
		writer.println("</body>");
		writer.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}