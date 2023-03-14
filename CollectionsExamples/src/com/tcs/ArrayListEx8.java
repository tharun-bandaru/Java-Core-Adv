package com.tcs;

import java.util.ArrayList;

public class ArrayListEx8 {
	public static void main(String[] args) {
		
		ArrayList<Emp>a1=new ArrayList<Emp>();
		a1.add(new Emp(111,"ratan"));
		a1.add(new Emp(222,"anu"));
		ArrayList<Emp>a2=new ArrayList<Emp>();
		a2.add(new Emp(333,"sai"));
		a2.add(new Emp(444,"ram"));
		a2.removeAll(a1);
		a2.retainAll(a1);
		for(Emp e:a2)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		

	}

}
