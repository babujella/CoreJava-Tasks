package com.org.Java8;

import java.util.Scanner;

public class ho {
	private static String message;

	public static void main (String[] args) {
		Object lock = new Object();

		Thread thread1 = new Thread(() -> {
			synchronized (lock) {
			//	message = "Hii Babu thread 1 will be waiting for ur ...";
				if(message==null) {
					try {
						lock.wait();

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (lock) {
				message = "Hii Babu thread 1 will be waiting for ur execution...";
				lock.notify();
			}
		});

		thread1.start();
		thread2.start();
	}
}
