package com.vikram.springbootcrud.service;

import java.util.List;

import com.vikram.springbootcrud.model.Employee;

public interface EmployeeService {

	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
