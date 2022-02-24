package com.revature;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Inside the run method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		System.out.println("Thread State : " + t1.getState());
		t1.start();
		System.out.println("Thread State : " + t1.getState());

		ThreadDemo t2 = new ThreadDemo();
		System.out.println("Thread State : " + t2.getState());
		t2.start();
		System.out.println("Thread State : " + t2.getState());
		System.out.println("Thread Name :" + t2.getName());
		System.out.println("Thread Id :" + t2.getId());
		System.out.println("Thread priority:" + t2.getPriority());
		System.out.println("Thread Group:" + t2.getThreadGroup());
	}

}
