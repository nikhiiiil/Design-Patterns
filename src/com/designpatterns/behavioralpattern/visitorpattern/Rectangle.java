package com.designpatterns.behavioralpattern.visitorpattern;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Rectangle drawn");
	}

	@Override
	public void move(int x, int y) {
		System.out.println("Pointer moved to position ("+x+","+y+")");
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);	
	}
	
}
