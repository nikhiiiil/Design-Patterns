package com.threads.daemon;

public class NonDaemonThread {

	public static void main(String[] args) {
		
		Thread th =  new Thread(() -> {
			System.out.println("Am i daemon thread: " + Thread.currentThread().isDaemon());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread is never stopped");
		});
		th.setDaemon(false);
		th.start();
		
		System.out.println("Main thread is about to finish, JVM is not exiting because of non daemon thread");
	}

}
