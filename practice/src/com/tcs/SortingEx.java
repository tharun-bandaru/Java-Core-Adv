package com.tcs;

import java.util.ArrayList;
import java.util.Collections;

public class SortingEx {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("ram");
		al.add("sai");
		System.out.println("Before Sorting"+al);
		Collections.sort(al);
		System.out.println("After Sorting"+al);
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(10);
		ai.add(0);
		ai.add(200);
		ai.add(88);
		System.out.println("Before sorting"+ai);
		Collections.sort(ai);
		System.out.println("After Sorting"+ai);
		
		
	}

}
