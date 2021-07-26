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
		MyThread thread_1 = new MyThread("Thread One");
		//To execute the run method
		thread_1.start();
		//Initiating thread 2
		MyThread thread_2 = new MyThread("Thread Two");
		thread_2.start();
		System.out.println("After Main thread" + Thread.currentThread());
		
		//Creating a thread using thread class anonymous
		Thread thread_3 = new Thread("Sethu") {
			@Override // It is not mandatory to include the annotation here.
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread());
			}
		};
		thread_3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//We can also create a multiple thread using a for loop
		System.out.println(Thread.currentThread().getName());
	    for(int i=0; i<10; i++){
	      new Thread("Thread-" + i){
	    	  @Override
	    	  public void run(){
	          System.out.println("Thread: " + getName() + " running");
	        }
	      }.start();
	    }
	}
}
