package com.designpatterns.structuralpattern.decoratorpattern;

public class EncryptionDecorator extends DataSourceDecorator {

	EncryptionDecorator(DataSource ds) {
		super(ds);
	}

	@Override
	public String writeData(String data) {
		
		System.out.println(data + " is encrypted");
		
		return this.wrapper.writeData(data);
	}

	@Override
	public String readData() {
		return null;
	}

}
