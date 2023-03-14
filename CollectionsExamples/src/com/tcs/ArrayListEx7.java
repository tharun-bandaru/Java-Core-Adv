package com.tcs;
import java.util.ArrayList;
//adding one collection data to another collection
public class ArrayListEx7 {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("ratan");
		a1.add("anu");
		ArrayList<String> a2=new ArrayList<String>(a1);//using constructor approach
		a2.add("tharun");
		a2.add("sai");
		System.out.println(a2);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(10);
		a3.add(20);
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(100);
		a4.add(200);
		ArrayList<Integer> a5=new ArrayList<Integer>();
		a5.addAll(a3);
		a5.addAll(a4);
		System.out.println(a5);
}
}
