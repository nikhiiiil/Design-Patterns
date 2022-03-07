package com.designpattern.creationalpattern.factorypattern;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n############ FACTORY DESIGN PATTERN #############\n");
		
		DataSourceFactory myFactory = new DataSourceFactory();
		IDataSource postgresSource = myFactory.getDBInstance(DBType.POSTGRES.getType());
		postgresSource.createTable();
		postgresSource.insertData();
		postgresSource.fetchData();
		
		System.out.println("\n################################################\n");
		
		IDataSource oracleSource = myFactory.getDBInstance(DBType.ORACLE.getType());
		oracleSource.createTable();
		oracleSource.insertData();
		oracleSource.fetchData();
		
		System.out.println("\n################################################\n");
		
		IDataSource mysqlSource = myFactory.getDBInstance(DBType.MYSQL.getType());
		mysqlSource.createTable();
		mysqlSource.insertData();
		mysqlSource.fetchData();
	}

}
