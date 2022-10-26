package com.threads.synchronization;

public class TestClass {
	
	public synchronized void synchronizedMethod() {
		Thread t = Thread.currentThread();
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread["+t.getName()+"] -> " + i);
		}
	}
	
	public void synchronizedBlock() {
		
		// synchronized block can be for a fewer statements too 
		synchronized(this) {
			Thread t = Thread.currentThread();
			for(int i=0; i<5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread["+t.getName()+"] -> " + i);
			}
		}
		
	}
}
