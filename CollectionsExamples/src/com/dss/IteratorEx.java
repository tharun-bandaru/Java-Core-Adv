package com.dss;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("ratan");
	al.add("ramu");
	al.add("anu");
	Iterator i=al.iterator();
	//iterator using normal version
	while(i.hasNext())
	{
		String s=(String)i.next();
		System.out.println(s);
	}
	System.out.println("**********");
	Iterator<String> i1=al.iterator();
	while(i1.hasNext())
	{
		String s=i1.next();
		System.out.println(s);
	}

	}

}
