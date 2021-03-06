package com.designpatterns.creationalpattern.factorypattern;

import java.util.List;

public interface IDataSource {
	
	String createTable();
	Boolean insertData();
	List<String> fetchData();
}
