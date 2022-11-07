package com.threads.stopathread;

public class Type2 {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() ->{
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Performing my task");
			}
		});
		// t1.setDaemon(true);
		
		System.out.println("Hurray! I'm got a task");
		t1.start();
		
		// Waiting for 100 milli secs for thread to complete its task
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { e.printStackTrace();}
		
		System.out.println("He thinks he can do it forever.. hahah.. I can kill him buahhhh.");
		t1.interrupt();
				
		System.out.println("Is he still printing? ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
}
