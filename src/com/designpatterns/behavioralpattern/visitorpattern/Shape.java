package com.designpatterns.behavioralpattern.visitorpattern;

public interface Shape {
	
	public void draw();
	
	public void move(int x, int y);
	
	public void accept(Visitor v);
}
