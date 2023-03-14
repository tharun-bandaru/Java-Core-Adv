
package com.tcs;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyListener implements HttpSessionListener {
    ServletContext ctx=null;  
    static int total=0,current=0;  

    public MyListener() {
    }

    public void sessionCreated(HttpSessionEvent event)  { 
    	System.out.println("Session object created with id:"+event.getSession().getId());
    	total++;
    	current++;
        ctx = event.getSession().getServletContext();  
        ctx.setAttribute("totalusers", total);  
        ctx.setAttribute("currentusers", current);  
    }
    public void sessionDestroyed(HttpSessionEvent event)  { 
    	System.out.println("Session object Destroyed with id:"+event.getSession().getId());
    	current--;  
        ctx.setAttribute("currentusers",current);  
    }	
}