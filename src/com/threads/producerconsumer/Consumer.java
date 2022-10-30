package com.threads.producerconsumer;

public class Consumer extends Thread {
	
	Main main = null;
	
	Consumer(Main obj){
		this.main = obj;
	}
	
	@Override
	public void run() {
		try {
			this.main.consume();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
