package com.org.PracticeExamples;

interface BaseI{
	void method();
}

public class LexioGraphicalOrder {
	public void method() {
		System.out.println("Inside BaseC::method");
	}
}
class User extends LexioGraphicalOrder implements BaseI{
	public static void main(String[] args) {
		User user=new User();
		user.method();
	}
}
