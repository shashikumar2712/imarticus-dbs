package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Employee;
import com.example.demo.dao.EmployeeRepo;

@Service
public class EmployeeService implements EmpServiceInterface {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee findById(int id) {
		return employeeRepo.findById(id).get();
	}
	
	@Override
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	
	@Override
	public Employee updateEmployee(int id,Employee employee) {
	Optional<Employee>	emp= employeeRepo.findById(id);
	if(emp.isPresent())
	{
		return employeeRepo.save(employee);
	}
	else
	{
		return null;
	}
	}

	@Override
	public Employee deleteEmployee(int id) {
		Optional<Employee>	emp= employeeRepo.findById(id);
		if(emp.isPresent())
		{
			 employeeRepo.deleteById(id);
			 return emp.get();
		}
		else
		{
			return null;
		}
		
	}
	
	
}
