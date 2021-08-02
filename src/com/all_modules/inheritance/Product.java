package com.all_modules.inheritance;

public class Product {
	private int productId;
	private String productName;
	
	public Product() {
		System.out.println("Default Product Constructor");
	}
	
	public Product(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void testInheritance() {
		System.out.println("This is from Product method");
	}
	
	public void testInheritance_1() {
		System.out.println("This is from Product method");
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}
