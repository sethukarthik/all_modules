package com.all_modules.thread_demo;

public class RunnableAnno {
	public static void main(String[] args) {
		Runnable runA = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {			
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}				
					System.out.println("i = " + i + " " + Thread.currentThread());
				}
			}
		};
		
		runA.run();
	}
}
