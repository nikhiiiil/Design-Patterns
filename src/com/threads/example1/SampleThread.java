package com.threads.example1;

public class SampleThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			
			try {
				// Sleep is a static Method
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		SampleThread t1 = new SampleThread();
		System.out.println("Thread id: " + t1.getId());
		System.out.println("Thread name: " + t1.getName());
		System.out.println("Thread priority: " + t1.getPriority());
		
		t1.setName("myThread");
		t1.setPriority(1);
		
		System.out.println("\nThread name: " + t1.getName());
		System.out.println("Thread priority: " + t1.getPriority());
		
		// Starts the execution of thread 
		t1.start();
		
		try {
			// This means main thread will be waiting for thread 1 to finish
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread[" + Thread.currentThread().getName() + "] is Main Program Thread");
	}
}
