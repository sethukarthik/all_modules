package com.all_modules.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	static void isList() {
		List<Integer> str = Arrays.asList(1,2,3);
		System.out.println("Create list using asList " + str);
	}
	
	public static int asList(int... a) {
		System.out.println(a);
		for (int i : a) {
			System.out.println(i);
		}
		
		ArrayList<Integer> l = new ArrayList<>(2);
		
		return 0;
    }
	
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
		ArrayList<Integer> in_1 = new ArrayList<>();
		ArrayList<Integer> in_2 = new ArrayList<>();
		in_1.add(1);
		in_1.add(2);
		in_1.add(3);
		in_1.add(1);
		in_1.add(2);
		in_2.add(2);
		System.out.println(in_1);
		in_1.remove(2);
		System.out.println(in_1);
				
		ArrayListDemo.isList();		
		//asList
		ArrayListDemo.asList(1, 2, 3, 5, 6);
		//Right shift operator
		int a = 10;
		System.out.println("Right shift operator" + (a >> 1));
	}
}
