package com.bitlabs.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.test.entity.Employee;

@Repository
public interface EmployeeRepositoryInterface extends JpaRepository<Employee, Integer>{
	
	List<Employee> findEmployeeByEname(String ename);

}
