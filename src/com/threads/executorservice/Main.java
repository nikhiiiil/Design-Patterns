package com.threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		// Creates a thread pool with only 1 thread
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		// Creates a thread pool with 3 threads
		//ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		// Creates a new thread pool with needed threads
		//ExecutorService executorService = Executors.newCachedThreadPool();
		
		WorkTask task1 = new WorkTask("task1");
		WorkTask task2 = new WorkTask("task2");
		WorkTask task3 = new WorkTask("task3");
		WorkTask task4 = new WorkTask("task4");
		WorkTask task5 = new WorkTask("task5");
		WorkTask task6 = new WorkTask("task6");
		WorkTask task7 = new WorkTask("task7");
		
		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);
		executorService.submit(task4);
		executorService.submit(task5);
		executorService.submit(task6);
		executorService.submit(task7);
		
		executorService.shutdown();
	}

}
