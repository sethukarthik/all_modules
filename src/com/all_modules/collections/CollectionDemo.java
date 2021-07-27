package com.all_modules.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
	
	public static void main(String[] args) {
		//Collection is a parent of all the interface
		Collection<Integer> collections = new ArrayList<>();
		collections.add(1);
		collections.add(2);
		collections.add(3);
		collections.add(4);	
		System.out.println(collections);
		//Find the object
		System.out.println(collections.contains(4));
		//Collection Interface
		Collection<Integer> collections_1 = new ArrayList<>();
		collections_1.add(5);
		collections_1.add(6);
		collections_1.add(7);
		collections_1.add(8);
		collections_1.addAll(collections);
		//adding two collections
		System.out.println(collections_1);
		//Collections class
		Collections.addAll(collections_1, 100,200,300,400);
		// Printing elements 
		System.out.println(collections_1);
//		collections_1.forEach(System.out::println);
		//Clear 
		collections.clear();
		System.out.println(collections);
		//List is a collections. It is a specialized collection
		//Using collection we cannot add element at a particular position
		List<Integer> lists = new ArrayList<>();
		lists.add(0, 1);
		lists.add(0, 2);
		lists.add(1, 3);
		System.out.println(lists);
		
		Collections.sort(lists);
		System.out.println(lists);
	}
}
