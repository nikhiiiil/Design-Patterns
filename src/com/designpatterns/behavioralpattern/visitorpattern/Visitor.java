package com.designpatterns.behavioralpattern.visitorpattern;

public interface Visitor {
	
	public void visit(Square s);
	
	public void visit(Rectangle r);
	
	public void visit(Circle c);
	
}
