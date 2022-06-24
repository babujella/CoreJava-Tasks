package com.org.MultiThreading;



/*A thread  has "add" operation,other thread performs"avg" and
	other thread performs "display" operation
	which  displays avg and add details after the two threads are compeletely performed.*/

class Add extends Thread{
	public void run() {
		for(int i=0;i<=4;i++) {
			System.out.println("Hii");
			try {

				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class Avg extends Thread{
	public void run() {
		for(int j=0;j<=4;j++) {
			System.out.println("Babu");
			try {

				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
class Display extends Thread{
	public void run() {
		for(int k1=0;k1<=1;k1++) {
			System.out.println("Bye");
			try {
				Thread.sleep(50);
			}catch(InterruptedException j) {
				System.out.println(j);
			}
		}
	}
}
public class AddAvg {
	public static void main(String[] args) throws InterruptedException {
		Add add=new Add();
		Avg avg=new Avg();
		Display display=new Display();
		add.start();
		System.out.println(add.isAlive());
		try {
			Thread.sleep(50);
		}catch(Exception e) {
			System.out.println(e);
		}
		avg.start();
		add.join();
		avg.join();
		display.start();

		System.out.println(add.isAlive());


	}
}

