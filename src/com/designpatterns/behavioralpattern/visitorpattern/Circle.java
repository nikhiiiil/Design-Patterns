package com.designpatterns.behavioralpattern.visitorpattern;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println("Circle drawn");
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
