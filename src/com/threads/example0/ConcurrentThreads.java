package com.threads.example0;

public class ConcurrentThreads extends Thread {
	
	@Override
	public void run() {
		Thread t = currentThread();
		for(int i=0; i<10; i++) {
			System.out.println("Thread["+ t.getName()+"] -> "+ i);
		}
	}

	public static void main(String[] args) {
		
		ConcurrentThreads t1 = new ConcurrentThreads();
		ConcurrentThreads t2 = new ConcurrentThreads();
		t1.start();
		t2.start();
		System.out.println("Main Program is finished");
	}

}
