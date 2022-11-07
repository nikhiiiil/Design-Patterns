package com.threads.GatherScatterPattern;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {

	CountDownLatch countDownLatch = null;
	Set<Integer> prices = null;
	
	Task(CountDownLatch latch, Set<Integer> prices) {
		this.prices = prices;
		this.countDownLatch = latch;
	}
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Integer cost = new Random().nextInt(1000);
		System.out.println("Thread[" + Thread.currentThread().getName() +"] Purchased item costs: Rs " + cost + "/-");
		prices.add(cost);
		this.countDownLatch.countDown();
	}
}
