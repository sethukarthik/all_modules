package com.all_modules.thread_demo;

public class VolatileDemo extends Thread {
	volatile boolean keepRunning = true;
	
	@Override
	public void run() {
		long count = 0;
		while(keepRunning) {
			count++;
		}
		System.out.println("After thread completion: " + count);
	}
	
	public static void main(String[] args) throws InterruptedException {
		VolatileDemo vThread = new VolatileDemo();
		vThread.start();
		Thread.sleep(1000);
		vThread.keepRunning = false;
	}
}
