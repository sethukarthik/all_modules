package com.all_modules.thread_demo;

public class RunnableAnno{
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("This is run method as annonymous way of implementation");				
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
