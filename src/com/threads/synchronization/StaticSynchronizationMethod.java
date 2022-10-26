package com.threads.synchronization;

public class StaticSynchronizationMethod extends Thread {
	
	public synchronized static void display() {
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
	
	public void run() {
		StaticSynchronizationMethod.display();
	}
	
	public static void main(String[] args) {
		
		StaticSynchronizationMethod t1 = new StaticSynchronizationMethod();
		StaticSynchronizationMethod t2 = new StaticSynchronizationMethod();
		StaticSynchronizationMethod t3 = new StaticSynchronizationMethod();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
