package com.spring_demo.maven_demo;

public class ExcuteMavenDemo {

	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.setCustomer(new ChildCustomer());
		acc.print();
		
		//Singleton will available until the container get close(It will cache by the container)
		//Prototype will available until his job done. Once his job done it will garbage collected (It won't cache by the container)
	}
	
}