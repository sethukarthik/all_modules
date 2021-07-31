package com.all_modules.queue_demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public PriorityQueue<String> queueS;
	public PriorityQueue<Integer> queueI;
	
	public PriorityQueueDemo() {
		this.queueS = new PriorityQueue<>();
		this.queueI = new PriorityQueue<>();
	}
	
	static <T> T prioQueue(T a){
		PriorityQueue<String> q = new PriorityQueue<>();
		q.add("A");
		q.add("B");
		q.add("CS");
		System.out.println("------------");
		System.out.println(q.remove("CS"));
		System.out.println(q);
		return a;
	}
	
	// we can define the size of the queue by passing the size as argument
	public void initCap() {
		PriorityQueue<Double> iC = new PriorityQueue<>(1);
		iC.add(10.2d);
		iC.add(10.2d);
		iC.add(10.2d);
	}
	
	// we can define the size of the queue by passing the size as argument
	public void prioCap() {
		PriorityQueue<Double> iC = new PriorityQueue<>();
		iC.add(10.2d);
		iC.add(1.2d);
		iC.add(0.2d);
		
		PriorityQueue<Double> s = new PriorityQueue<>(iC);
		s.add(2d);
		s.add(3d);
		s.add(4d);
		System.out.println(s);
	}
	
	public void pull() {
		PriorityQueue<Integer> iC = new PriorityQueue<>();
		iC.add(10);
		iC.add(1);
		iC.add(2);
		
		PriorityQueue<Integer> s = new PriorityQueue<>();
		s.add(10);
		s.add(25);
		s.add(15);
		System.out.println(s.poll());
		System.out.println(s.peek());
		System.out.println(s);
	}
	
	public void usingComp() {
		this.queueI.add(10);
		this.queueI.add(30);
		this.queueI.add(20);
		this.queueI.add(50);
		this.queueI.add(40);
		this.queueI.offer(80);
		
		Iterator<Integer> intV = queueI.iterator();
		while (intV.hasNext()) {
			Integer integer = (Integer) intV.next();
			System.out.println(integer);
		}
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(this.queueI);
		
		System.out.println("BEFORE COMPARATOR INTERFACE " + p);
		System.out.println("BEFORE COMPARATOR INTERFACE " + p.offer(5));
		System.out.println("AFTER OFFER " + p);
		
		//since the comparator is null it return null to com
		Comparator com = p.comparator();
		//we will get null here
		System.out.println("AFTER COMPARATOR INTERFACE " + com);
		
//		System.out.println(this.queueI);
	}
	
	public static void main(String[] args) {
//		int a = PriorityQueueDemo.prioQueue(1);
//		System.out.println(a);
		PriorityQueueDemo pq = new PriorityQueueDemo();
//		pq.initCap();
//		pq.prioCap();
//		pq.pull();
		pq.usingComp();
	}
}