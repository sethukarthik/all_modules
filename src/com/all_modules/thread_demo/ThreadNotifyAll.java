package com.all_modules.thread_demo;

public class ThreadNotifyAll {
	//Method to wait the thread 1
		public void produce() throws InterruptedException {
			synchronized (this) {			
				System.out.println("Produce before wait");
				wait();
				System.out.println("Produce after wait");
			}
		}
		
		//Method to notify the wait
		public void consumer() throws InterruptedException {
			synchronized (this) {
				System.out.println("Consumer before notify");
				Thread.sleep(1000);
				//notifyAll();
				//Sleep Timer
				Thread.sleep(1000);
				System.out.println("Consumer after notify");
			}
		}
		
		//Method to notify the wait
		public void producerAll() throws InterruptedException {
			synchronized (this) {
				System.out.println("ProducerAll before notify");
				wait();
				System.out.println("ProducerAll after notify");
			}
		}
		
		//Method to notify the wait
		public void consumerAll() throws InterruptedException {
			synchronized (this) {
				System.out.println("consumerAll before notify");
				Thread.sleep(1000);
				notify();
				//Sleep Timer
				Thread.sleep(1000);
				System.out.println("consumerAll after notify");
			}
		}

		//Initialize the thread
		public static void threadCall() {
			//Initialize the class
			ThreadNotifyAll tWait = new ThreadNotifyAll();
			ThreadNotifyAll tWait_2 = new ThreadNotifyAll();
			//Thread 1
			Thread thread_1 = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						tWait.produce();
						tWait_2.producerAll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			//Thread 2
			Thread thread_2 = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
//						tWait.consumer();
						tWait_2.consumerAll();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			
			//Thread 3
			Thread thread_3 = new Thread(new Runnable() {

				@Override
				public void run() {
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
			thread_3.start();
			
			//Join the thread
			try {			
				thread_1.join();
				thread_2.join();
				thread_3.join();
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
