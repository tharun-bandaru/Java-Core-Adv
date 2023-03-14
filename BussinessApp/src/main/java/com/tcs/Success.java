package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Success() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     response.setContentType("text/html");
     HttpSession session=request.getSession(false);
     String prem=(String) session.getAttribute("premium");
     PrintWriter writer=response.getWriter();
     if(prem.equals("yes"))
     {
    	 writer.println("Premium Companies Investors");
    	 RequestDispatcher dispatcher=request.getRequestDispatcher("category1.html");
    	 dispatcher.include(request, response);
     }
     else {
     
     writer.println("Free Companies Investors");
     RequestDispatcher dispatcher=request.getRequestDispatcher("category2.html");
	 dispatcher.include(request, response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
