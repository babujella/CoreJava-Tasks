package com.org.PracticeExamples;


class Examples implements Runnable {
	private Thread t;
	private String ThreadName;
	Examples(String ThreadName){
		this.ThreadName=ThreadName;
	}
	public void run() {
		while(true)
			System.out.println(ThreadName);
	}
	public void start() {
		if(t==null) {
			t=new Thread(this,ThreadName);
			t.start();
		}
	}
}
public class Example{
	public static void main(String[] args) {
		Examples examples1=new Examples("A");
		Examples examples2=new Examples("B");
		examples2.start();
		examples1.start();
	}
}
