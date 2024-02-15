package com.interview;


interface Swimmable{
	void swim();
}

interface Flyable{
	void fly();
}

abstract class Runble{
	public abstract void run();
}

public class Main extends Runble {

	public static void main(String[] args) {
		Main m = new Main();
//		m.swim();
//		m.fly();
		m.run();
	}

//	@Override
//	public void swim() {
//		// TODO Auto-generated method stub
//		System.out.println("Swimming");
//	}
//	public void fly() {
//		System.out.println("Flying");
//	}
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
	}
}
