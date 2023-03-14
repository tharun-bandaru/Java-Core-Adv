package com.tcs;



public class Test{
	public static void main(String[] args) {
		
		String a[]= new String[5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		a[0]="ratan";
		a[1]="ram";
		a[2]="hari";
		for(String aa:a)
		{
			System.out.println(aa);
		}
		
		}
}
