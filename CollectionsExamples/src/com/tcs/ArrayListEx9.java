package com.tcs;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx9 {

	public static void main(String[] args) {
		//conversion of Arrays to Collection
		String[] s= {"ratam","anu","sravya"};
		ArrayList<String> a=new ArrayList<String>(Arrays.asList(s));
		a.add("aaa");
		a.add("bbb");
		System.out.println(a);
		System.out.println("**********");
		
		//generic conversion of Collection to Arrays
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		a1.add("sravya");
		String[] str=new String[a1.size()];
		a1.toArray(str);
		System.out.println(a1);
		System.out.println("**********");
		
		//conversion of Collection to Arrays
		ArrayList data=new ArrayList();
		data.add(10);
		data.add(10.5);
		data.add("ratan");
		Object[] oo=data.toArray();
		for(Object o:oo)
		{
			System.out.println(o);
		}
		System.out.println("**************");
		

	}

}
