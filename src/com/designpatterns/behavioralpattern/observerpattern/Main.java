package com.designpatterns.behavioralpattern.observerpattern;

public class Main {

	public static void main(String[] args) throws Exception {
		// We have a store
		Store store = new Store("Apple Store");
		
		// we now have few customers
		Customer customer1 = new Customer("Peter");
		Customer customer2 = new Customer("MJ");
		Customer customer3 = new Customer("Goblin");
		
		// Customer are Intrested in different Iphones
	    store.addSubscriber("iphone15", customer1);
	    store.addSubscriber("macbook pro", customer3);
	    store.addSubscriber("air pods", customer2);
	    store.addSubscriber("macbook pro", customer1);
		
	    Thread.sleep(500);
	    
	    store.update("macbook pro");
	    Thread.sleep(1000);
	    store.removeSubscriber("macbook pro", customer1);
	    
	    Thread.sleep(1500);
	    store.update("macbook pro");

	}

}
