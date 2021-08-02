package com.all_modules.inheritance;

public class Inventory {
	private Product product;
	private int count = 1;

	public Inventory(Product product) {
		this.product = product;
	}

	public Inventory() {
		System.out.println("Default Inventory " + count);	
		count++;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Inventary [product=" + product + "]";
	}
}
