package com.all_modules.interface_demo;

public class TestFood {
	public static void main(String[] args) {
		Indian indian = new Indian();
		indian.display();
		
		Italian italian = new Italian(indian);
		italian.display();
		
		Food f = new Indian();
		f.display();
		
		Food f1 = (Food) new Italian(indian);
		f1.display();
	}
}
