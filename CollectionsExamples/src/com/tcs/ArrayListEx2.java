package com.tcs;
import java.util.ArrayList;
public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(new Emp(111,"tharun"));
		al.add(new Student(1,"sai"));
		al.add(null);
		for(Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.eid+" "+e.ename);
			}
			if( o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.sid+" "+s.sname);
			}
			if(o==null)
			{
				System.out.println(o);
			}
		}
	    Student ss=(Student)al.get(1);
	    System.out.println(ss.sname);
	}

}
