package com.all_modules.thread_demo;

public class SynchronizedThread extends Thread {
	public int count = 0;
	
	//When a method marked as synchronized then a single thread able to access at a time. 
	public synchronized void increment() { // Method Locl
		count++;
	}
	
//	Similarly we can define a specific line be synchronized
//	public void increment() { 
//		synchronized (this) { // This is also called synchronized block(object Lock)
//			count++;
//		}
//	}
	
	public void syncThread() {
		Thread thread_1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				System.out.println(count);
			}
		});
		
		Thread thread_2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
				System.out.println(count);
			}
		});
		thread_1.start();
		thread_2.start();
		
		try {
			thread_1.join();
			thread_2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SynchronizedThread syThread = new SynchronizedThread();
		syThread.syncThread();
	}
}
