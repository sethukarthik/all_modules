package com.all_modules.association;

public class Student {
	private long rollNumber;
	private String student;
	
	public Student() {
		
	}
	
	public Student(long rollNumber, String student) {
		this.rollNumber = rollNumber;
		this.student = student;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}
		
}
