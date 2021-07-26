package com.all_modules.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list_1 = new ArrayList<>();
		list_1.add("a");
		list_1.add("b");
		list_1.add("a");
		list_1.add("c");
		list_1.add("d");
		System.out.println(list_1);
		Iterator<String> it = list_1.iterator();
		//using consumer lambda
		it.forEachRemaining((e) -> { 
			System.out.println(e+"-"+e);
		});

		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		ListIterator<String> lit = list_1.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		while (lit.hasPrevious()) {
			String s = lit.previous();
			System.out.println(s);
		}
	}
}
