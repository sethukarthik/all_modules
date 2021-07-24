package com.all_modules.thread_demo;

public class RunnableLambda {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("This is runnable run with Lambda");
		};
		
		Thread thread = new Thread();
		thread.start();
	}
}
