package com.tcs;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx5 {

	public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<String>(Collections.nCopies(10,"tharun"));
	System.out.println(al);
	
	ArrayList<String> a=new ArrayList<String>();
	a.add("ratan");
	a.add("anu");
	a.add("ram");
	a.add("sai");
	System.out.println("Before Swapping..."+ a);
	Collections.swap(a, 1, 3);
	System.out.println("After Swapping...."+ a);
	
	
	}

}
