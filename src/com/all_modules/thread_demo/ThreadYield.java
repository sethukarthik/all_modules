package com.all_modules.thread_demo;

public class ThreadYield extends Thread {
	
	public ThreadYield(String name) {
		setName(name);
		start();
	}

	@Override
	public void run() {
		System.out.println("This is Run");
	}
	// Using yield will give low priority to the threads from main thread
	public static void main(String[] args) {
		System.out.println("Main method begin");
		// Thread 1
		ThreadYield thread_1 = new ThreadYield("Thread 1");
		// Thread 2
		ThreadYield thread_2 = new ThreadYield("Thread 1");
		Thread.yield();
		System.out.println("Main method end");
	}
}
