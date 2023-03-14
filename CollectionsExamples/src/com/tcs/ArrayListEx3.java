package com.tcs;
import java.util.ArrayList;
public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(111,"ratan"));
		al.add(new Emp(222,"ram"));
		for(Emp e:al)
		{
			if(e instanceof Emp)
			{
				System.out.println(e.eid+" "+e.ename);
			}
		}

	}

}
