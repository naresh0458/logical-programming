package com.bitlabs.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.test.entity.Employee;
import com.bitlabs.test.repository.EmployeeRepositoryInterface;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	private EmployeeRepositoryInterface eri;
	@Override
	public String saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		eri.save(employee);
		return "employee details are saved successfully";
	}
	@Override
	public List<Employee> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
		return eri.findAll();
	}
	@Override
	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		String str="Enter correct id";
		Employee em=eri.findById(id).get();
		if(em!=null)
		{
		 eri.deleteById(id);
		 str="employee details are deleted successfully";
		}
		return str;
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return eri.findById(id).get();
	}
	@Override
	public String updateEmployeeById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Employee emp=eri.findById(id).get();
		if(emp!=null)
		{
			eri.save(employee);
			return "updated successfully";
		}
		else
		{
			return "Enter correct id";
		}
	}
	@Override
	public List<Employee> getEmployeeByName(String ename) {
		// TODO Auto-generated method stub
		return eri.findEmployeeByEname(ename);
	}

}
