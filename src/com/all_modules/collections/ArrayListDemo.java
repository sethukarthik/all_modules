package com.all_modules.collections;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Character> str = new ArrayList<>();
		str.add('s');
		str.add('e');
		str.add('t');
		str.add('h');
		str.add('u');
		str.add(0, 'M');
		str.add(1, '.');
		System.out.println(str.size());
		System.out.println(str.isEmpty());
		//Iterator over for
		for (Character character : str) {
			System.out.println(character);
		}
		//using iterator
		Iterator<Character> chr = str.iterator();
		//while loop
		while(chr.hasNext()) {
			System.out.println(chr.next());
		}
		ListIterator<Character> list = str.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
