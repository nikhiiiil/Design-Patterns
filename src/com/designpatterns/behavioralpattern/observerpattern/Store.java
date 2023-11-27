package com.designpatterns.behavioralpattern.observerpattern;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Store implements Observer {
	
	private String name;
	
	public Store(String name) {
		this.name = name;
	}
	
	Map<String, List<Subscriber>> itemSubscribersMap = new HashMap<>();

	@Override
	public void addSubscriber(String item, Subscriber subscriber) {
		this.itemSubscribersMap.putIfAbsent(item, new ArrayList<Subscriber>());
		if(!this.itemSubscribersMap.get(item).contains(subscriber)) {
			this.itemSubscribersMap.get(item).add(subscriber);
		}
	}

	@Override
	public void removeSubscriber(String item, Subscriber subscriber) {
		if(this.itemSubscribersMap.get(item).contains(subscriber)) {
			this.itemSubscribersMap.get(item).remove(subscriber);
		}
	}

	@Override
	public void update(String item) {
		System.out.println(this.name + ": Guys I've added " + item + " to the store");
		List<Subscriber> subscribers = this.itemSubscribersMap.getOrDefault(item, new ArrayList<>());
		subscribers.stream().forEach(subscriber -> {
			subscriber.notify(item);
		});
	}

}
