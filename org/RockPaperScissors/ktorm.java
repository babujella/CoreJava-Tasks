package com.org.RockPaperScissors;

abstract class ktorm {
	abstract void run();
}

class ktor extends ktorm{
	public void run() {
		System.out.println("Hiiiiiiiiiiii");
	}
	public static void main(String[] args) {
		ktor k=new ktor();
		k.run();
	}
}
