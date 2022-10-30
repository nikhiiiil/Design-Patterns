package com.threads.producerconsumer;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class Main {

	LinkedList<String> data = new LinkedList<>();
	int capacity = 5;
	
	public void produce() throws InterruptedException {
		while (true) {
			synchronized(this.data) {
				if(this.capacity == this.data.size()) {
					this.data.wait();
				}
				String value = LocalDateTime.now().toString();
				data.add(value);
				System.out.println("Producer produces => " + value);
				this.data.notify();
			}
			Thread.sleep(500);
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized(this.data) {
				if(this.data.isEmpty()) {
					this.data.wait();
				}			
				System.out.println("Consumer consumed => " + this.data.removeFirst());
				this.data.notify();
			}
			Thread.sleep(3000);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Main obj = new Main();
		Consumer consumer = new Consumer(obj);
		Producer producer = new Producer(obj);
		
		consumer.start();
		producer.start();
	}

}
