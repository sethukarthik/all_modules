package com.all_modules.association;

import java.util.ArrayList;
import java.util.List;

public class Institute {
	private int code;
	private String instituteName;
	private List<Department> departments;
	
	public Institute(int code, String instituteName, List<Department> departments) {
		this.code = code;
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
	public int getTotalNumberOfStudents() {
		int noOfStudent = 0;
		List<Student> studentCount;
		for(Department dept: getDepartments()) {
			studentCount = dept.getStudents();
			for (Student student : studentCount) {
				System.out.println("RoleNumber: " + student.getRollNumber() + " FullName: " + student.getStudent() + " Department: " + dept.getDepartName());
				noOfStudent++;
			}
		}
		return noOfStudent;
	}
}
