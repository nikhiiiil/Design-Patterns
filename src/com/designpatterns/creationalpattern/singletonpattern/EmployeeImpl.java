package com.designpatterns.creationalpattern.singletonpattern;

import java.util.Objects;

public class EmployeeImpl implements IEmployeeService {
	
	private static EmployeeImpl employeeImpl = null;
	
	private EmployeeImpl() {}
	
	public static synchronized EmployeeImpl getInstance() {
		if(Objects.isNull(employeeImpl)) {
			employeeImpl = new EmployeeImpl();
		}
		return employeeImpl;
	}

	@Override
	public void saveEmployee() {
		System.out.println("Saving Employee into Database");
	}

	@Override
	public void updateEmployee(Long empId) {
		System.out.println("Updating employee :: "+ empId +" into Database");
	}

	@Override
	public Integer deleteEmployee(Long empId) {
		System.out.println("Deleting employee :: "+ empId +" from Database");
		return null;
	}
}
