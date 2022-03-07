package com.designpatterns.creationalpattern.factorypattern;

import java.util.List;

public class MySqlDataSource implements IDataSource {

	private static final String TYPE = DBType.MYSQL.getType();
	
	@Override
	public String createTable() {
		System.out.println("Create Table Query is prepared for " + TYPE + " DataSource");
		return null;
	}

	@Override
	public Boolean insertData() {
		System.out.println("Inserting data for " + TYPE + " DataSource");
		return null;
	}

	@Override
	public List<String> fetchData() {
		System.out.println("Fetching records for " + TYPE + " DataSource");
		return null;
	}

}
