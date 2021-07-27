package com.all_modules.interface_demo;

public interface InterfaceTwo {
	
	void testInterfaceTwo(); 
	
	default int returnInt(int i) {
		return i;
	}

	static char returnChar(char c) {
		return c;
	}

}