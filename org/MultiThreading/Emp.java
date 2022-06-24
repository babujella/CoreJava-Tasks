package com.org.MultiThreading;

public class Emp {
	private static String message;

	public static void main (String[] args) {
		Object lock = new Object();

		Thread thread1 = new Thread(() -> {
			synchronized (lock) {
				while (message == null) {
					try {
						lock.wait();
						//System.out.println("Hii");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}

			System.out.println(message);
		});

		Thread thread2 = new Thread(() -> {
			synchronized (lock) {
				System.out.println("Helloo");
				message = "A message from thread1";
				lock.notify();
			}
		});

		thread1.start();
		thread2.start();
	}
}

