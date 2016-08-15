package com.tu.test;

public class TimeDemo extends AbstractTime{

	@Override
	public void template() {
		System.out.println("I'm a subclass, I have my code...");
		for (int i = 0;i < 100;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TimeDemo timeDemo = new TimeDemo();
		timeDemo.getTime();
	}
}
