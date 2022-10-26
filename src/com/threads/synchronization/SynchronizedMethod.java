package com.threads.synchronization;

public class SynchronizedMethod extends Thread {
	
	TestClass test;
	
	public SynchronizedMethod(TestClass obj) {
		this.test = obj;
	}
	
	public void run() {
		test.synchronizedMethod();
	}

	public static void main(String[] args) {
		
		TestClass t = new TestClass();
		
		SynchronizedMethod t1 = new SynchronizedMethod(t);
		SynchronizedMethod t2 = new SynchronizedMethod(t);
		SynchronizedMethod t3 = new SynchronizedMethod(t);
		
		// All 3 thread are trying to access same code with composition
		t1.start();
		t2.start();
		t3.start();

	}

}
