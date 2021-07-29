package com.all_modules.array_list;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ArrayListDemp {
	public static void main(String[] args) {
		
		List<Integer> in = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			in.add(i);
			System.out.println("HashCode-"+in.hashCode());
		}
		
		//Convert ArrayList to Array Need to implement more on this
//		Integer[] obj = (Integer[]) in.toArray();
		
		
		//Iterate the ArrayList
//		in.forEach((ele) -> System.out.println(ele));
		//Iterate with hast code
		in.forEach((ele) -> System.out.println(ele.hashCode()));
		
		//Remove
		List<Integer> in_1 = new ArrayList<>();
		List<Integer> in_2 = new ArrayList<>();
		in_1.add(1);
		in_1.add(2);
		in_1.add(3);
		in_1.add(1);
		in_1.add(2);
		in_2.add(2);
		System.out.println(in_1);
		in_1.remove(in_2);
		System.out.println(in_1);
		
	}
}
