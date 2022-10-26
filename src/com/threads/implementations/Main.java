package com.threads.implementations;

public class Main {

	public static void main(String[] args) {
		
		ThreadUsingInheritance t1 = new ThreadUsingInheritance();
		Thread t2 = new Thread(new ThreadUsingInterface());
		
		t1.start();
		t2.start();
	}

}
