package com.all_modules.association;

import java.util.ArrayList;
import java.util.List;

public class ExecuteDemo {
	public static void main(String[] args) {
		Student s1 = new Student(1234567890l, "Sethu");
		Student s2 = new Student(1357925457l, "Kavi");
		Student s3 = new Student(7643780433l, "Nagesh");
		Student s4 = new Student(8866331156l, "Nithya");
		Student s5 = new Student(1987654321l, "Shri");
		//Listing the student based on the department
		List<Student> cse = new ArrayList<>();
		cse.add(s2);
		cse.add(s3);
		
		List<Student> ece = new ArrayList<>();
		ece.add(s1);
		ece.add(s4);
		
		List<Student> ca = new ArrayList<>();
		ca.add(s5);
		
		//Instantiate Department
		Department eceDepar = new Department(123, "ECE", ece);
		Department cseDepar = new Department(579, "CSE", cse);
		Department caDepar = new Department(498, "CA", ca);
		
		List<Department> depart = new ArrayList<>();
		depart.add(eceDepar);
		depart.add(cseDepar);
		depart.add(caDepar);

		Institute inst = new Institute(12246, "MSNK University", depart);
		
		System.out.println("Total Number of students: " + inst.getTotalNumberOfStudents());
	}
}
