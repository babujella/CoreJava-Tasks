package com.org.MultiThreading;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Thread {
	 public void run() {
	        while (true) {
	            try {
	                synchronized(this) {
	                    wait();
	                }
	                // do something with longs
	                System.out.println("doing something: " + this.longs);
	            }
	            catch (InterruptedException e) {}
	        }
	    }
	    public void addLong(Long l) {
	        synchronized(this) {
	            this.longs.add(l);
	            notifyAll();
	        }
	    }
    private List longs = new ArrayList();
    public static void main(String args[]) {
        Employee lt = new Employee();
        lt.start();
        new LongSupplier(lt).start();
    }
}


class LongSupplier extends Thread {
    private Employee lt;
    public LongSupplier(Employee lt) {
        this.lt = lt;
    }
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                this.lt.addLong(new Long(123));
            }
            catch (InterruptedException e) {}
        }
    }
}
