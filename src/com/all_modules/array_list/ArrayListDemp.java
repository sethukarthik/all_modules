package com.all_modules.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemp {
	public static void main(String[] args) {
		
		List<String> in = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			in.add("Temp-"+i);
			System.out.println("HashCode-"+in.hashCode());
		}
		//Iterate the ArrayList
//		in.forEach((ele) -> System.out.println(ele));
		//Iterate with hast code
		in.forEach((ele) -> System.out.println(ele.hashCode()));
	}
}
