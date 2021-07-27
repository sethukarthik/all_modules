package com.all_modules.interface_demo;

public interface InterfaceTwo {
	
	void testInterface(); 
	
	default int returnInt(int i) {
		return i;
	}

	static char returnChar(char c) {
		return c;
	}
}