package com.all_modules.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ArrayListSynch {

	//It is thread-safe concurrent access of ArrayList. When ArrayList is modified, 
	//it will create a fresh copy of the underlying array.

	//CopyOnWriteArrayList does not lock the whole list. When a thread writes into the list, 
	//It simply replaces the list by a fresh copy of the underlying array
	public static void arrayCopy() {
		CopyOnWriteArrayList<String> cpA = new CopyOnWriteArrayList<>();
		cpA.add("geek");
		cpA.add("code");
		cpA.add("practice");
		cpA.add("Test");
		cpA.add("Copy");
		cpA.add("Consume");
		System.out.println(cpA);
		//Make the list Synchronized
		List<String> sCPA = Collections.synchronizedList(cpA);
//		System.out.println(sCPA);

		// Iterating on the synchronized ArrayList using iterator.
		Iterator<String> it = sCPA.iterator();

		while (it.hasNext()) {        	
			cpA.set(5, "Insert");
			String string = it.next();
//			System.out.println(string);
		}
		System.out.println(cpA);
	}

	public static void testCopy() {
		CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>(); 
		al.add("A"); 
		al.add("B"); 
		al.add(null); 
		al.add("D"); 
		al.add("E"); 
		al.add("H"); 
//		System.out.println(al); 
		List<String> synlist = Collections.synchronizedList(al); 

		// Here, Synchronized block is not required. 
		// Call iterator() method using reference variable synlist. 
		Iterator<String> itr = synlist.iterator(); 
		while(itr.hasNext()) 
		{ 
			al.set(5, "F"); // It will not throw ConcurrentModificationException during Iteration. 
			String str = itr.next(); 
//			System.out.println(str); 
		} 
		System.out.println(al); 
	}

	//With ArrayList we cannot modify the ArrayList by adding a new element
	public static void arraySync() {
		//we can also define the array list inside the synclist
		//List<Integer> ls = Collections.synchronizedList(new ArrayList<>(30));
		//ls.add(3);

		List<String> lst = new ArrayList<>();
		//Now the sList is synchronized
		List<String> sList = Collections.synchronizedList(lst);
		for (int i = 0; i < 5; i++) {
			sList.add("Temp-"+i);
		}

		synchronized (sList) {
			Iterator<String> iSList = sList.iterator();
			while (iSList.hasNext()) {
				System.out.println(iSList.next() + " --- " + iSList.hashCode());
				iSList.remove();
				System.out.println(sList);
				//sList.add() - will create ConcurrentModifcationException
			}
		}
	}

	//Here we are using Synchronized keyword to make the ArrayList as thread safe
	public static void main(String[] args) {
		ArrayListSynch.arrayCopy();
//				ArrayListSynch.arraySync();
		ArrayListSynch.testCopy();
	}
}
