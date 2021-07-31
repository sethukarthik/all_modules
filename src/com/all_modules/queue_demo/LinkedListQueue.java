package com.all_modules.queue_demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * List of Method available for Queue (LinkedList)
 * add - To add object
 * remove - To remove object
 * poll - To remove object at the top 
 * peek - See the object at the top without removing queue[0] 
 * element - 
 * offer - 
 */

public class LinkedListQueue {
	public Queue<String> linkedListString; 
	public Queue<Integer> linkedListInt; 
	
	public LinkedListQueue() {
		linkedListInt = new LinkedList<>();
		linkedListString = new LinkedList<>();
	}
	
	public void addEle() {
		//add integer
		linkedListInt.offer(23);
		linkedListInt.offer(53);
		linkedListInt.offer(13);
		linkedListInt.offer(null); //In linkedList we can add null but now with the priorityQueue.
		linkedListInt.offer(12);		
		linkedListInt.offer(89);		
		linkedListInt.offer(12);		
		Iterator<Integer> ite = linkedListInt.iterator();
		
		while (ite.hasNext()) {
			Integer integer = (Integer) ite.next();
			System.out.println(integer);
		}
		System.out.println(linkedListInt.element());
		System.out.println(linkedListInt.peek());
		System.out.println(linkedListInt.poll());
		System.out.println(linkedListInt.remove(12));		
		
		System.out.println(linkedListInt);
	}
	
	public static void main(String[] args) {
		LinkedListQueue addEl = new LinkedListQueue();
		addEl.addEle();
	}
}
