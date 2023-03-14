package com.dss;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("ram");
		//using for each method
		for(String s:al)
		{
			System.out.println(s);
		}
		System.out.println("**********");
		//using get method
		String s=al.get(0);
		System.out.println(s);
		//using generic version
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			String s1=i.next();
			System.out.println(s1);
		}
		//removing data using iterator
		Iterator<String> i1=al.iterator();
		while(i1.hasNext())
		{
			if(i1.equals("ratan"))
			{
				al.remove("ratan");
			}
		}
		//displaying the data
		for(String ss:al)
		{
			System.out.println(ss);
		}
}
}