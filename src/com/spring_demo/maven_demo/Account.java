package com.spring_demo.maven_demo;

public class Account {
 
	private Customer customer;

	public Account(Customer customer) {
		System.out.println("Account Constuctor with customer");
		this.customer = customer;
	}

	public Account() {
		System.out.println("Default Account Constuctor");
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + "]";
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void print() {
		customer.print();
	}

}
