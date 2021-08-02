package com.all_modules.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
	Deque<Object> arrayD;
	
	public ArrayDequeDemo(Deque<Object> arrayD) {
		this.arrayD = arrayD;
	}

	public void dequeTest() {
		arrayD.add("seh");
		arrayD.add(1);
		arrayD.add("sdf");
		Iterator<Object> obj = arrayD.iterator();
		while (obj.hasNext()) {
			Object object = (Object) obj.next();
			if(object instanceof String) {
				System.out.println(object);
			}
		}
	}

	public static void main(String[] args) {
		ArrayDequeDemo dq = new ArrayDequeDemo(new ArrayDeque<>());
		dq.dequeTest();
	}
}
