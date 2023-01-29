package com.springboot.restapi.service;

import java.util.List;

import com.springboot.restapi.model.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployee();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Integer id);
	
	Employee updateEmployee(Employee employee, Integer id);
	
	void deleteEmployeeById(Integer id);
}
