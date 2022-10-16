package com.designpatterns.structuralpattern.decoratorpattern;

public class FileDataSource implements DataSource {

	private String filename;
	
	FileDataSource(String filename) {
		this.setFilename(filename);
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	@Override
	public String writeData(String data) {
		System.out.println(data + " -> is being written into file with name " + getFilename());
		return data;
	}

	@Override
	public String readData() {
		
		return "Data is being read";
	}

}
