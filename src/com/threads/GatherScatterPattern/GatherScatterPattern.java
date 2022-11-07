package com.threads.GatherScatterPattern;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GatherScatterPattern {
	// Task is to fetch prices from different web sites of a product and sum them.
	
	public static void main(String[] args) {
		Set<Integer> prices = Collections.synchronizedSet(new HashSet<>());
		CountDownLatch latch = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.submit(new Task(latch, prices));
		executor.submit(new Task(latch, prices));
		executor.submit(new Task(latch, prices));
		
		try {
			//latch.await(); // waits until count down becomes to zero
			
			// Wait until count down becomes 0 or max wait for 5 seconds
			latch.await(5, TimeUnit.SECONDS); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Total purchase items cost: Rs " + prices.stream().mapToInt(Integer::intValue).sum() + "/-");
		executor.shutdown();
	}
	
	// Other ways to solve this using completable future which every submit returns wait for all futures to complete
	// Notify and wait methods
	// Object locking and conditions
	// Phasers
	

}
