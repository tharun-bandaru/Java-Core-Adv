package com.tcs;
import java.util.ArrayList;
//contains() vs containsAll()
public class ArrayListEx6 {

	public static void main(String[] args) {
		Emp e1=new Emp(111,"ratan");
		ArrayList<Emp> a1=new ArrayList<Emp>();
		a1.add(e1);
		a1.add(new Emp(222,"anu"));
		ArrayList<Emp> a2=new ArrayList<Emp>(a1);
		a2.add(new Emp(333,"ram"));
		a2.add(new Emp(444,"sai"));
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a2));
		a2.remove(e1);
		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a1));
		for(Emp e:a2) {
			System.out.println(e.eid+" "+e.ename);
		}
		

	}

}
