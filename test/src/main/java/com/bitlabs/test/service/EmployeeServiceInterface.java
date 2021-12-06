package com.bitlabs.test.service;

import java.util.List;

import com.bitlabs.test.entity.Employee;

public interface EmployeeServiceInterface {

	String saveEmployee(Employee employee);

	List<Employee> getAllEmployeeDetails();

	String deleteEmployeeById(int id);

	Employee getEmployeeById(int id);

	String updateEmployeeById(int id, Employee employee);

	List<Employee> getEmployeeByName(String ename);

}
