package com.all_modules.queue_demo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
	private Queue<String> qPriority;
	
	public QueueClass(Queue<String> qPriority) {
		this.qPriority = qPriority;
	}

	public void qPriority() {
		qPriority.add("Geeks");
		qPriority.add("For");
		qPriority.add("Geeks");
		qPriority.add("Apple");
		
		System.out.println(qPriority);
		
	}
	
	public static void main(String[] args) {
		QueueClass qc = new QueueClass(new PriorityQueue<>());
		qc.qPriority();
	}
}
