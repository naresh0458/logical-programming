package com.bitlabs.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.test.entity.Employee;
import com.bitlabs.test.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface esi;
	@PostMapping("/saveemployee")
	public String saveEmployee(@RequestBody Employee employee)
	{
		return esi.saveEmployee(employee);
	}
	@GetMapping("/getallemployeedetails")
	public List<Employee> getAllEmployeeDetails()
	{
		return esi.getAllEmployeeDetails();
	}
	@DeleteMapping("/deleteemployeebyid/{id}")
	public String deleteemployeebyid(@PathVariable("id") int id)
	{
		return esi.deleteEmployeeById(id);
	}
	@GetMapping("/getemployeebyid/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id)
	{
		return esi.getEmployeeById(id);
	}
	@PutMapping("/updateemployeebyid/{id}")
	public String updateEmployeeById(@PathVariable("id") int id,@RequestBody Employee employee)
	{
		return esi.updateEmployeeById(id,employee);
	}
	@GetMapping("/getemployeebyname/{ename}")
	public List<Employee> getEmployeeByName(@PathVariable("ename") String ename)
	{
		return esi.getEmployeeByName(ename);
	}
}
