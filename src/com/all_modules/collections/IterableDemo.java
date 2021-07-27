package com.all_modules.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IterableDemo {
	public static void main(String[] args) {
		List<Integer> list_1 = new ArrayList<>();
		list_1.add(1);
		list_1.add(2);
		list_1.add(3);
		list_1.add(4);
		
		Iterator<Integer> l = list_1.iterator();
		
		l.forEachRemaining(null);
		
		Spliterator<Integer> spliterator = list_1.spliterator();
		
		Collection collection = new ArrayList();
		
		spliterator.forEachRemaining((e) -> {
			System.out.println(e);
		});
		
		list_1.forEach((e) -> {
			System.out.println(e);
		});
	}
}
