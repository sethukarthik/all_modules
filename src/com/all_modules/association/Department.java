package com.all_modules.association;

import java.util.List;

public class Department {
	private int departId;
	private String departName;
	private List<Student> students;
	
	public Department() {
	}
	
	public Department(int departId, String departName, List<Student> students) {
		this.departId = departId;
		this.departName = departName;
		this.setStudents(students);
	}

	public int getDepartId() {
		return departId;
	}
	
	public void setDepartId(int departId) {
		this.departId = departId;
	}
	
	public String getDepartName() {
		return departName;
	}
	
	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
