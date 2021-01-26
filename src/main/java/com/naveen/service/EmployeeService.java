package com.naveen.service;

import java.util.List;

import com.naveen.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}