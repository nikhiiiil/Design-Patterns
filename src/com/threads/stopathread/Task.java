package com.threads.stopathread;

public class Task implements Runnable {

	private volatile Boolean killThread = null;
	
	Task() { killThread = false; }
		
	public Boolean getKillThread() {
		return killThread;
	}

	public void setKillThread(Boolean killThread) {
		this.killThread = killThread;
	}

	public void run() {
		while(!killThread.equals(Boolean.TRUE)) {
			System.out.println("Performing my task");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}