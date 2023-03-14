package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class MyFilter1 implements Filter {

    public MyFilter1() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
	
		int num1=Integer.parseInt(request.getParameter("num1"));
		if(((Object)num1).getClass().getSimpleName().equals("Integer"))
		{
		chain.doFilter(request, response);
		}
		else
		{
			writer.println("Error response ,enter valid integer");
			request.getRequestDispatcher("form.html").include(request, response);
		}
		
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
