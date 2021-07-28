package com.all_modules.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class ArrayListSynch {
	
	//Iterator does not throw ConcurrentModificationException even if copyOnWriteArrayList is modified once iterator is created 
	//because iterator is iterating over the separate copy of ArrayList
	//while write operation is happening on another copy of ArrayList.
	public static void arrayCopy() {
		List<String> cpA = new CopyOnWriteArrayList<>();
		cpA.add("geek");
		cpA.add("code");
		cpA.add("practice");
  
        System.out.println("Elements of synchronized ArrayList :");
  
        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> it = cpA.iterator();
  
        while (it.hasNext()) {        	
        	cpA.add("Nwe");
//        	it.add
        	System.out.println(it.next());
        }
	}
	
	//With ArrayList we cannot modify the ArrayList by adding a new element
	public static void arraySync() {
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
			}
		}
	}
	
	//Here we are using Synchronized keyword to make the ArrayList as thread safe
	public static void main(String[] args) {
//		ArrayListSynch.arrayCopy();
		ArrayListSynch.arraySync();
	}
}
