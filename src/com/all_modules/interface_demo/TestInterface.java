package com.all_modules.interface_demo;

public class TestInterface {
	
	public static void main(String[] args) {
		
		InterfaceTwo me = new InterfaceTwo() {

			@Override
			public void testInterface() {
				System.out.println("Test");
			}
			
		};
		
		me.testInterface();
	}
}
