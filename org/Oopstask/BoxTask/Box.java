package com.org.Oopstask.BoxTask;

public class Box {
	double l, b, h;
	Box(double l,double b,double h ) {
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public void area() {
		double ar=2*((l*b)+(l*h)+(b*h));
		System.out.println(ar+" area box");
	}
	public void volume() {
		double vol=l*b*h;
		System.out.println(vol+" vol of box");
	}
}
