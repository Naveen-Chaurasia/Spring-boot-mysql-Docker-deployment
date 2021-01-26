package com.naveen.dao;

import java.util.List;

import com.naveen.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();

	void insertEmployee(Employee employee);
}