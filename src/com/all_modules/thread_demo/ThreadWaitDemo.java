package com.all_modules.thread_demo;

public class ThreadWaitDemo {

	//Method to wait the thread 1
	public void produce() {
		synchronized (this) {			
			System.out.println("Produce before wait");
			try {				
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Produce after wait");
		}
	}
	
	//Method to notify the wait
	public void consumer() throws InterruptedException {
		synchronized (this) {
			System.out.println("Consumer before notify");
			Thread.sleep(1000);
			notify();
			//Sleep Timer
			Thread.sleep(1000);
			System.out.println("Consumer after notify");
		}
	}

	//Initialize the thread
	public static void threadCall() {
		ThreadWaitDemo tWait = new ThreadWaitDemo();
		//Thread 1
		Thread thread_1 = new Thread(new Runnable() {

			@Override
			public void run() {
				tWait.produce();
			}
		});
		//Thread 2
		Thread thread_2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is producer before wait");
				try {
					tWait.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		//Start the thread
		thread_1.start();
		thread_2.start();
		
		//Join the thread
		try {			
			thread_1.join();
			thread_2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Main thread before threadCall");
		threadCall();
		System.out.println("Main thread after threadCall");
	}
}

/*
	Difference between Notify() and NotifyAll()
	Notify() -> Will resume the waiting thread in the same object
	NotifyAll() -> Will resume all the waiting threads
*/