package com.tcs;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("thread class run method");
	}
	public void run(int a)
	{
		System.out.println("1-arg run method");
	}
}
public class ThreadDemo{
	 public static void main(String[] args) {
		MyThread m=new MyThread();
		m.run();
		for(int i=0;i<10;i++)
			System.out.println("Thread class method");
}
}
