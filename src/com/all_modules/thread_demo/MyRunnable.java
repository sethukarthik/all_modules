package com.all_modules.thread_demo;

public class MyRunnable implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {			
			System.out.println("i = " + i + Thread.currentThread());
		}
		// If the sleep is outside the loop it will execute after the for loop
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//Create a Runnable and assign to Thread object to create a thread name
		MyRunnable run_1 = new MyRunnable();
		Thread thread = new Thread(run_1, "Runnable with Thread Name");
		thread.start();
		MyRunnable run_2 = new MyRunnable();
		run_2.run();
	}
}
