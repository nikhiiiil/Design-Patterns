package com.threads.synchronization;

public class SynchronizedBlock extends Thread {
	
	TestClass test = null;
	
	public SynchronizedBlock(TestClass obj) {
		this.test = obj;
	}
	
	public void run() {
		this.test.synchronizedBlock();
	}

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		
		SynchronizedBlock t1 = new SynchronizedBlock(t);
		SynchronizedBlock t2 = new SynchronizedBlock(t);
		SynchronizedBlock t3 = new SynchronizedBlock(t);
		
		// All 3 thread are trying to access same code with composition
		t1.start();
		t2.start();
		t3.start();
		
	}
}
