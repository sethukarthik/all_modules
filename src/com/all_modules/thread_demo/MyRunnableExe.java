package com.all_modules.thread_demo;

public class MyRunnableExe implements Runnable {
	private final long countUntil;

	MyRunnableExe(long countUntil) {
		this.countUntil = countUntil;
	}

	@Override
	public void run() {
		long sum = 0;
		for (long i = 1; i < countUntil; i++) {
			sum += i;
		}
		//System.out.println("Sum for thread "+sum);
	}
}
