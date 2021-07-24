package com.all_modules.thread_demo;

public class MyThread extends Thread {
		
	public MyThread(String threadName) {
		setName(threadName);
	}
	//Override the Runnable interface method
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {			
			System.out.println("i= "+ i + " " + Thread.currentThread());
			//sleep the thread and this has to be inside the try catch
			try {				
				Thread.sleep(500);
			}catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		//To get the current thread 
		System.out.println("Before Main thread" + Thread.currentThread());
		//Initialize an object and call the start method to run the thread 
		MyThread thread = new MyThread("Thread One");
		//To execute the run method
		thread.start();
		System.out.println("After Main thread" + Thread.currentThread());
	}
}
