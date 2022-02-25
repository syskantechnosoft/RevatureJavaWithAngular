package com.revature.mavendemo;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();

		ThreadDemo obj1 = new ThreadDemo();

		System.out.println(t1);

		t1.setName("My Thread");
		t1.setPriority(MAX_PRIORITY);

		System.out.println(t1);

		System.out.println(Thread.currentThread().getName());
	}

}
