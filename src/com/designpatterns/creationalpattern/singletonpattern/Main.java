package com.designpatterns.creationalpattern.singletonpattern;

public class Main {

	public static void main(String[] args) {
		
		EmployeeImpl employeeImpl = EmployeeImpl.getInstance();
		employeeImpl.saveEmployee();
		employeeImpl.updateEmployee(1L);
		employeeImpl.deleteEmployee(1L);

	}

}
