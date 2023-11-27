package com.designpatterns.behavioralpattern.observerpattern;

public interface Observer {
	
	public void addSubscriber(String item, Subscriber subscriber);
	
	public void removeSubscriber(String item, Subscriber subscriber);
	
	public void update(String item);
}
