package com.designpattern.creationalpattern.factorypattern;

public enum DBType {
	POSTGRES("postgres"), ORACLE("oracle"), MYSQL("mysql");

	String type;

	DBType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
