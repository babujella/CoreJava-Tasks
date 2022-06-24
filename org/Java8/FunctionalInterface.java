package com.org.Java8;

interface Hello extends Square{
	void myMethod();
}
interface Square {
	int calculate(int x);
}
public class FunctionalInterface {
	void myMethod() {
		System.out.println("Hello this is main interface");
	}
	public static void main(String args[])
	{
		FunctionalInterface obj=new FunctionalInterface();
		obj.myMethod();
		int a = 5;
		Square s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println(ans);
	}
}


