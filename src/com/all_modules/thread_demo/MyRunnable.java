package com.all_modules.thread_demo;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("This is runnable override method");
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		MyRunnable name = new MyRunnable();
		name.run();
	}
}
