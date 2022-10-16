package com.designpatterns.structuralpattern.decoratorpattern;

public class CompressionDecorator extends DataSourceDecorator {

	CompressionDecorator(DataSource ds) {
		super(ds);
	}

	@Override
	public String writeData(String data) {
		
		System.out.println(data + " is compressed");
		
		return this.wrapper.writeData(data);
	}

	@Override
	public String readData() {
		return null;
	}

}
