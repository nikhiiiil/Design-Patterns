package com.threads.executorservice;

public class WorkTask implements Runnable {
	
	private String taskName;
	private long createdTime;
	
	public WorkTask(String name) {
		this.taskName = name;
		this.createdTime = System.currentTimeMillis();
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
        long waitedTime = System.currentTimeMillis() - createdTime;
        System.out.println(taskName + " got CPU after waiting for " + waitedTime + "ms with thread " + currentThread.getName());

        try {
            Thread.sleep(3000);

            System.out.println(taskName + " completed. Releasing thread" + currentThread.getName());
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		
	}
}
