package com.org.MultiThreading;


class MyClass22 extends Thread{
	public void run() {

		System.out.println("Welcome to India");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}
class MyClass11 extends Thread{
	public void run() {

		System.out.println("Helloo");
		try {
			Thread.sleep(50);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}	
public class ThreadLifeCyle {
	public static void main(String[] args) throws InterruptedException {
		MyClass22 myclass=new MyClass22();
		MyClass11 myclass1=new MyClass11();
		myclass.start();
		myclass1.start();
		myclass.setName("Daemon");
		System.out.println(myclass.getName());
		myclass.setPriority(10);
		System.out.println(myclass.getPriority());
		myclass1.setPriority(1);
		System.out.println(myclass1.getPriority());
		myclass.join();
		myclass1.join();
		System.out.println(myclass.isAlive());
		System.out.println(myclass1.isAlive());
		System.out.println(myclass.isDaemon());
		System.out.println(myclass1.isDaemon());


	}

}

