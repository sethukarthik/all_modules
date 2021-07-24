package com.all_modules.thread_demo;

public class RunnableLambda {
	public static void main(String[] args) {
		Runnable runL = () -> {
			for (int i = 1; i < 5; i++) {			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
				System.out.println("i = " + i + " " + Thread.currentThread() + " ");
			}
		};
		
		Thread thread = new Thread(runL, "Runnable Lambda");
		thread.start();
	}
}
