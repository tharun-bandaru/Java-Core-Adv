package com.tcs;
import java.util.ArrayList;
public class ArrayListOperations {
	public static void main(String args[])
	{
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(10.5);
		a.add("naresh");
		a.add("ratan");
		a.add(10);
		a.add(null);
		System.out.println(a);// 10 10.5 naresh ratan 10 null
		System.out.println(a.size()); //6
		
		a.add(3,"anu");// 10 10.5 narsh anu ratan 10 nnull
		System.out.println(a);
		
		a.remove(2);  //10 10.5 anu ratan 10 null
		a.remove("ratan");// 10 10.5 anu 10 null
		
		a.set(1,"raani");
		System.out.println(a);// 10 raani anu 10 null
		
		System.out.println(a.isEmpty());
		a.clear();
		System.out.println(a.isEmpty());
		
	}
	
}
