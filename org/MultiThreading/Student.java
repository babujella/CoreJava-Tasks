//
//package com.org.MultiThreading;
//
//class StuDent extends Thread {
//	private String name;
//	public StuDent() {
//		this.name=name;
//	}
//	public void run() {
//		try {
//			synchronized(this) {
//				wait();
//				System.out.println("Student is : Babu");
//			}
//		}catch(Exception e) {}
//	}
//}
//class Teacher extends Thread{
//	private String name;
//	public Teacher() {
//		this.name=name;
//	}
//	public void run() {
//		try {
//			synchronized(this) {
//				System.out.println("I am Teacher");
//				notify();
//			}
//		}catch(Exception e) {}
//	}
//}
//public class Student{
//	public static void main(String[] args) {
//		StuDent st=new StuDent();
//		Teacher t=new Teacher();
//		st.start();
//		t.start();
//	}
//}