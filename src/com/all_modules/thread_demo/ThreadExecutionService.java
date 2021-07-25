package com.all_modules.thread_demo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreadExecutionService extends JFrame{

	JButton but;
	public ThreadExecutionService(){

		but = new JButton("click");
		but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startThreads();

			}
		});
		add(but);
	}
	private static final int NTHREDS = 1000;

	public static void main(String[] args) {
		ThreadExecutionService main = new ThreadExecutionService();
		main.setSize(300, 300);
		main.setVisible(true);
	}
	
	public void startThreads(){
		//With NewFixedThreadPool we have to define the number of thread to be handle the process
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
		//ExecutorService executor = Executors.newCachedThreadPool();
		//ExecutorService executorService = Executors.newWorkStealingPool();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++) {
			Runnable worker = new MyRunnableExe(1000000L + i);
			//Thread thr = new Thread(worker);
			//thr.setPriority(5);
			executor.execute(worker);
		}
		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}
		long end = System.currentTimeMillis();
		System.out.println("Finished all threads "+(end-start));
	}
}


/*
	From JDk 1.5 we should not use a manual way of creating a thread and execution
	For that we have to use ExecutionService.
 */