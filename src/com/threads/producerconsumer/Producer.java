package com.threads.producerconsumer;

public class Producer extends Thread {
	
	Main main = null;
	
	Producer(Main obj){
		this.main = obj;
	}
	
	@Override
	public void run() {
		try {
			this.main.produce();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
