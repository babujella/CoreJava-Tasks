package com.org.Java8;

class multiEmployee extends Thread{
	public synchronized  void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Babu");
			if(i==2) {
				try {
					wait();
					Thread.sleep(50);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	}
}
class SingleEmployee extends Thread{
	public synchronized  void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Pavan");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class MultiEmployee {
	public static void main(String[] args) {
		multiEmployee emp=new multiEmployee();
		SingleEmployee semp=new SingleEmployee();
		emp.start();
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		semp.start();
		semp.notify();
	}
}
