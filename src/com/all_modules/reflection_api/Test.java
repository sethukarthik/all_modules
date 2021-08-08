package com.all_modules.reflection_api;

public class Test {
	String test;
	String s;

	public Test() {
		s = "Geek";
		System.out.println("Default Constructor");
	}
	
	public Test(String test) {
		this.test = test;
	}
	
	public void method() {
		System.out.println("Method" + s);
	}
	
	public void method_1(int i) {
		System.out.println(i);
	}
	
	public void method_1(String i) {
		System.out.println(i);
	}
}
