package com.designpatterns.behavioralpattern.observerpattern;

public class Customer implements Subscriber {
	
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}

	@Override
	public void notify(Object context) {
		System.out.println( this.name + ": Hurrah! " + context.toString() + " is now available");
	}
	
}
