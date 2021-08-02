package com.all_modules.inheritance;

public class Stock extends Product {
	
	private String nirmal;

	public String getNirmal() {
		return nirmal;
	}

	public void setNirmal(String nirmal) {
		this.nirmal = nirmal;
	}

	public Stock(String nirmal) {
		super();
		this.nirmal = nirmal;
	}
	
//	@Override
	public void testInheritance_2() {
		System.out.println("This is from Stack method");
	}
}