package com.threads.stopathread;

public class Type1 {

	public static void main(String[] args) throws InterruptedException {
		// Using volatile key word
		
		// Create a thread
		Task task = new Task();
		Thread t1 = new Thread(task);
		t1.setDaemon(true);
		
		// Start a thread
		t1.start();
		
		// Wait for sometime 
		Thread.sleep(3000);
		

		System.out.println("Stupid thread din't finish your task... I'm killing you bastard!");
		
		// kill a thread
		task.setKillThread(true);
		
		System.out.println("Is he still printing? ");
		Thread.sleep(3000);
	}

}
