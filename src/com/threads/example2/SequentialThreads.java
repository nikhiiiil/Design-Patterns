package com.threads.example2;

public class SequentialThreads extends Thread {

	public void run() {
		Thread t = currentThread();
		
		for(int i=0; i<3; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread[" + t.getName() + "] is printing -> " + i);
		}
	}
	
	public static void main(String[] args) {
		
		Thread t = currentThread();
		System.out.println("Main Thread name is ["+ t.getName() + "] with priority " + t.getPriority());
		
		SequentialThreads t1 = new SequentialThreads();
		t1.setName("Sequential-Thread-0");
		
		SequentialThreads t2 = new SequentialThreads();
		t2.setName("Sequential-Thread-1");
		
		System.out.println("Both threads t1,t2 states are " + t1.isAlive() + ","+ t2.isAlive());
		
		t1.start();
		try {
			// Execution is waiting for thread1 to complete
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		
		System.out.println("Main program thread is finished!");
	}

}
