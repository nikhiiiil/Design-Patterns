package com.designpatterns.behavioralpattern.visitorpattern;

public class ShareExporterVisitor implements Visitor {

	@Override
	public void visit(Square s) {
		System.out.println("Square is exported");		
	}

	@Override
	public void visit(Rectangle r) {
		System.out.println("Rectangle is exported");		
	}

	@Override
	public void visit(Circle c) {
		System.out.println("Circle is exported");	
	}

}
