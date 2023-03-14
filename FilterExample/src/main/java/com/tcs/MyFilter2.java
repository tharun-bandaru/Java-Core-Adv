package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter2  implements Filter {
	FilterConfig fConfig=null;
    public MyFilter2() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		String addr=request.getParameter("addr");
		if(addr.equalsIgnoreCase("hyderabad")) {
			
		System.out.println("sending request by MyFilter2");
		chain.doFilter(request, response);
		System.out.println("response by MyFilter2");
	    }
		else {
			writer.println("This is only of hyderbad people"+fConfig.getInitParameter("errorcode"));
			request.getRequestDispatcher("register.html").include(request, response);
			
		}
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Filter2 intialization");
		this.fConfig=fConfig;
		
	}

}
