package com.spring_demo.maven_demo;

public class ChildCustomer extends Customer {
	
	@Override
	public void print() {
		System.out.println("Printing form Child Customer instance method");
	}
}
