package com.designpatterns.behavioralpattern.visitorpattern;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Visitor visitor = new ShareExporterVisitor();
		
		List<Shape> shapes = Arrays.asList(new Circle(), new Rectangle(), new Square());
		
		shapes.forEach(shape -> shape.accept(visitor));
	}

}
