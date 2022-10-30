package com.threads.daemon;

public class DaemonThread {

	public static void main(String[] args) {
		
		Thread th =  new Thread(() -> {
			System.out.println("Am i daemon thread: " + Thread.currentThread().isDaemon());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread is never stopped");
		});
		th.setDaemon(true);
		th.start();
		
		System.out.println("Main program is finished, JVM Exists ignoring other daemon threads");
		
		// Other way to do without setting as daemon thread is System.exit(0); will kill all the threads
	}

}
