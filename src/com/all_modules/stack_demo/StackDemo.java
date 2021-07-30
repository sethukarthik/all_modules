package com.all_modules.stack_demo;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {
	
	static void defaultStack() {
		Stack<Integer> sInt = new Stack<>();
		sInt.add(1);
		sInt.add(2);
		sInt.add(3);
		sInt.add(4);
		
		Iterator<Integer> sIt = sInt.iterator();
		while (sIt.hasNext()) {
			System.out.println(sIt.next());	
		}
	}
	
	//Peek to peek the element at the top of the list
	//Push return the item
	//add return as boolean
	static void peekStack() {
		Stack<Integer> sInt = new Stack<>();
		sInt.add(1);
		sInt.add(2);
		sInt.add(3);
		//return boolean
		System.out.println(sInt.add(4));
		
		System.out.println(sInt.peek());
		//return the inserting item eg: 12
		System.out.println(sInt.push(12));
		System.out.println(sInt.peek());
//		Iterator<Integer> its = sInt.iterator();
//		while (its.hasNext()) {
//			its.next();
//		}
	}
	
	//Push - push the element at the top
	//Pop - Pop get the element at the top
	public static void pushPop() {
		Stack<String> sStr = new Stack<>();
		for (int i = 0; i < 10; i++) {
			sStr.push("Test-"+i);
		}
		sStr.add(2, "se");
		System.out.println(sStr.pop());
		System.out.println(sStr);
	}
	
	public static void searchStack() {
		Stack<String> sStr = new Stack<>();
		for (int i = 0; i < 10; i++) {
			sStr.push("search-"+i);
		}
		System.out.println(sStr.search("search-9"));
	}
	
	public static void main(String[] args) {
		//creating stack 
//		defaultStack();
		
		//peek the top of the element in the stack
		peekStack();
		
		//push & pop the top of the element in the stack
		pushPop();
		
		//Search
		searchStack();
	}
}
