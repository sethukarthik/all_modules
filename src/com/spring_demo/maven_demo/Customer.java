package com.spring_demo.maven_demo;

public class Customer {
	
	private int userId;
	private String userName;
	
	public Customer() {
		System.out.println("Default customer constructor");
	}

	public Customer(int userId, String userName) {
		System.out.println("Customer constructor with parameters ");
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void print() {
		System.out.println("Printing instance method of customer");
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + "UserName " + userName + "]";
	}
	
}