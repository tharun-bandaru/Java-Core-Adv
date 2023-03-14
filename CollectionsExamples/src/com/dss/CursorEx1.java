package com.dss;
import java.util.Enumeration;
import java.util.Vector;
public class CursorEx1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("ratan");
		v.add("anu");
		v.add("ram");
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			System.out.println(s);
		}

	}

}
