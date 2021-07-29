package com.all_modules.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Object> obj = new LinkedList<Object>();
		obj.add("Z");
		obj.add("b");
		obj.add("S");
		System.out.println(obj);
		
		List<Object> ob = new ArrayList<>();
		ob.add(1);
		ob.add(1, obj);
		System.out.println(ob);
	}
}
