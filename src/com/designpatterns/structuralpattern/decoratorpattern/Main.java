package com.designpatterns.structuralpattern.decoratorpattern;

public class Main {

	public static void main(String[] args) {
		
		String records = "Info";
		Boolean enableEncrypted = true;
		Boolean enableCompression = true;
		
		DataSource source =  new FileDataSource("file.txt");
		// Plain data is being written into file
		// fileSource.writeData(records);
		
		if(enableEncrypted) {
			source = new EncryptionDecorator(source);
			// Plain data is encrypted and then written into file
			// source.writeData(records);
		}
	
		if(enableCompression) {
			source = new CompressionDecorator(source);
			// Plain data is compressed first and then encrypted then written into file
			source.writeData(records);
		}
		
	}

}
