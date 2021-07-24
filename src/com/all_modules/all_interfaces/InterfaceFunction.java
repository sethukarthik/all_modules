package com.all_modules.all_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InterfaceFunction {
	int salary;
	
	public InterfaceFunction(int salary) {
		super();
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	static boolean getBoolean() {
		
		return true;
	}

	static void getBySal(List<InterfaceFunction> ifs, Function<InterfaceFunction, Boolean> func) {
		
		for(InterfaceFunction ifs_data : ifs) {
//			if( funca > 100) {
//				
//			}
		}
		
		Function<InterfaceFunction, Boolean> funca = (emp) -> {
			if(emp.salary > 100)
				return true;
			return false;
		};
	}
	
	public static void main(String[] args) {
		List<InterfaceFunction> l = new ArrayList<>();
		l.add(new InterfaceFunction(100));
		l.add(new InterfaceFunction(200));
		l.add(new InterfaceFunction(300));
		l.add(new InterfaceFunction(400));
	
		Function<InterfaceFunction, Boolean> func = (emp) -> {
			if(emp.salary > 100)
				return true;
			return false;
		};
		
		for(InterfaceFunction in : l) {
			System.out.println(func.apply(in));
		}
	}
}
