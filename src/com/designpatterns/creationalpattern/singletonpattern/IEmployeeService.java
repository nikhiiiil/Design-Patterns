package com.designpatterns.creationalpattern.singletonpattern;

public interface IEmployeeService {
	
	void saveEmployee();
	void updateEmployee(Long empId);
	Integer deleteEmployee(Long empId);
}
