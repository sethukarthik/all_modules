package com.all_modules.thread_demo;

public class ThreadJoin extends Thread {
	
	public ThreadJoin(String name) {
		// Why do we need to do this? is that right way to create name for the thread.
		//		Thread t = new Thread();
		//		t.setName(name);
		setName(name);
	}
	
	@Override
	public void run() {
		int[] array = {1,2,3,4,5};
		for (int i = 0; i < array.length; i++) {
			System.out.println("i = " + i + " " +  Thread.currentThread());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("This is main thread starting");
		ThreadJoin tj_1 = new ThreadJoin("Join one");
		//Set priority based to thread
//		tj_1.setPriority(MAX_PRIORITY); 
		tj_1.start();
		ThreadJoin tj_2 = new ThreadJoin("Join two");
//		tj_2.setPriority(MIN_PRIORITY);
		tj_2.start();
		//Join method to make other threads to wait until joined thread to complete
		tj_1.join();
		// tj_2.join(); //Waits at most mills milliseconds for this thread to die. A timeout of 0 means to wait forever. 
		System.out.println("Main thread completed");
	}
}
