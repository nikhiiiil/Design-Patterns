package com.designpatterns.creationalpattern.factorypattern;

public class DataSourceFactory {
	
	public IDataSource getDBInstance(String type) {
		switch (type) {
		case "postgres":
			return new PostgresDataSource();
		case "oracle":
			return new OracleDataSource();
		case "mysql":
			return new MySqlDataSource();
		default:
			throw new IllegalArgumentException("Invalid type received");
		}
	}
}
