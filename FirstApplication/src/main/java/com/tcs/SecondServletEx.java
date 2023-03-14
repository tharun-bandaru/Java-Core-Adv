package com.tcs;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServletEx extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServletEx() {
        super();
        
    }
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.println("Servlet Second application using GenericServlet");
	}
}
