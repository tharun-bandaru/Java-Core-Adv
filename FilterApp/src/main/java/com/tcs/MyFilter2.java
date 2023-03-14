package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2 implements Filter {

    public MyFilter2() {
        
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		String uadr=request.getParameter("uadr");
		
		if(uadr.equalsIgnoreCase("hyderabad"))
		{
			chain.doFilter(request, response);
		}
		else {
			writer.println("This application is for only Hyderabad ppl");
			request.getRequestDispatcher("Form.html").include(request,response);
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
