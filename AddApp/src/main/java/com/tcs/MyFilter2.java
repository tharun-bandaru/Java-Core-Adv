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
		
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		if(((Object)num2).getClass().getSimpleName().equals("Integer"))
		{
		chain.doFilter(request, response);
	}
		else {
			writer.println("error message enter valid number");
			request.getRequestDispatcher("form.html").include(request,response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
