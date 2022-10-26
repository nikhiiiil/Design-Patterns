package com.threads.synchronization;

public class NaiveApproach extends Thread {
	
	public void run() {
		Thread t = currentThread();
		for(int i=0; i<5; i++) {
			System.out.println("Thread["+t.getName()+"] -> " + i);
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		NaiveApproach t1 = new NaiveApproach();
		NaiveApproach t2 = new NaiveApproach();
		NaiveApproach t3 = new NaiveApproach();
		
		// Achieving synchronization using join()
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();

	}

}
