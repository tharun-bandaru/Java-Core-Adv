package com.dss;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratroEx {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("rata");
		al.add("ram");
		al.add("hari");
		al.add("rama");
		ListIterator<String> i =al.listIterator();
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
		System.out.println("**********");
		while(i.hasPrevious())
		{
			String s=(String)i.previous();
			System.out.println(s);
		}
	}

}
