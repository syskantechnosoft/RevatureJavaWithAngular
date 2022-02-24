package com.revature;

public class RunnableDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		RunnableDemo target = new RunnableDemo();
		Thread t2 = new Thread(target);
		Thread t3 = new Thread(target,"MyThread");
		Thread t4 = new Thread(target, "Runnable Thread-1");
		Thread t5 = new Thread();
		
		t2.setPriority(3);
		t3.setPriority(7);
		t4.setPriority(9);
		t5.setPriority(2);
		
		System.out.println("t1 Thread State : " + t1.getState());
		System.out.println("t2 Thread State : " + t2.getState());
		System.out.println("t3 Thread State : " + t3.getState());
		System.out.println("t4 Thread State : " + t4.getState());
		System.out.println("t5 Thread State : " + t5.getState());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("t1 Thread Priority : " + t1.getPriority());
		System.out.println("t2 Thread Priority : " + t2.getPriority());
		System.out.println("t3 Thread Priority : " + t3.getPriority());
		System.out.println("t4 Thread Priority : " + t4.getPriority());
		System.out.println("t5 Thread Priority : " + t5.getPriority());
		
		System.out.println("t1 Thread State : " + t1.getState());
		System.out.println("t2 Thread State : " + t2.getState());
		System.out.println("t3 Thread State : " + t3.getState());
		System.out.println("t4 Thread State : " + t4.getState());
		System.out.println("t5 Thread State : " + t5.getState());
		
		System.out.println("t1 Thread Name : " + t1.getName());
		System.out.println("t2 Thread Name : " + t2.getName());
		System.out.println("t3 Thread Name : " + t3.getName());
		System.out.println("t4 Thread Name : " + t4.getName());
		System.out.println("t5 Thread Name : " + t5.getName()); 
		
		System.out.println("t1 Thread ID : " + t1.getId());
		System.out.println("t2 Thread ID : " + t2.getId());
		System.out.println("t3 Thread ID : " + t3.getId());
		System.out.println("t4 Thread ID : " + t4.getId());
		System.out.println("t5 Thread ID : " + t5.getId()); 
		System.out.println("MIN PRIORITY " +Thread.MIN_PRIORITY);
		System.out.println("NORMAL PRIORITY " +Thread.NORM_PRIORITY);
		System.out.println("MAX PRIORITY " +Thread.MAX_PRIORITY);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Thread is Running");
	}

}
