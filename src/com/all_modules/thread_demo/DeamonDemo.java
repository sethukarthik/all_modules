package com.all_modules.thread_demo;

public class DeamonDemo {
	
	public void testDeman(){
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Running");
				}
			}
		};
		Thread thread = new Thread(runnable, "Test Deman");
		//By defining the Daemon as True then the thread will stop as soon as the main thread stop.
		thread.setDaemon(true);
		thread.start();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DeamonDemo dd = new DeamonDemo();
		 dd.testDeman();
		 System.out.println("Stoping Main Thread");
	}
}
