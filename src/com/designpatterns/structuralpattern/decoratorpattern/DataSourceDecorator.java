package com.designpatterns.structuralpattern.decoratorpattern;

public abstract class DataSourceDecorator implements DataSource {
	
	protected DataSource wrapper = null;
	
	DataSourceDecorator(DataSource ds){
		this.setWrapper(ds);
	}
	
	public DataSource getWrapper() {
		return wrapper;
	}

	public void setWrapper(DataSource wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public abstract String writeData(String data);

	@Override
	public abstract String readData();


}
