package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter {
	FilterConfig fConfig=null;

    public MyFilter1() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		int age=Integer.parseInt(request.getParameter("age"));
		if(age>20) {
		System.out.println("sending request to MyFilter1");
		chain.doFilter(request, response);
		System.out.println("response from MyFilter1");
		}
		else {
			writer.println("you are not elgibl for marriage"+fConfig.getInitParameter("errorcode"));
			request.getRequestDispatcher("register.html").include(request, response);
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter2 intialization");
		this.fConfig=fConfig;
	}

}
