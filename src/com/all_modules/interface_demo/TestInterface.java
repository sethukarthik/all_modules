package com.all_modules.interface_demo;

public class TestInterface implements InterfaceOne {
	
	public static void main(String[] args) {
		
		InterfaceOne me = new InterfaceOne() {

			@Override
			public void testInterfaceTwo() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public InterfaceTwo interfaceTwo() {
				// TODO Auto-generated method stub
				return null;
			}

		};
		me.testInterfaceTwo();
		me.interfaceTwo();
		int i = me.returnInt(100);
		char c = InterfaceTwo.returnChar('c');
		System.err.println(c);
	}

	@Override
	public InterfaceTwo interfaceTwo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testInterfaceTwo() {
		// TODO Auto-generated method stub
		
	}
}
