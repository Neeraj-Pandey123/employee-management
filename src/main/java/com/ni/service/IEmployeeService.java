package com.ni.service;

import java.util.List;

import com.ni.model.Employee;

public interface IEmployeeService {

	public abstract Integer saveEmployee(Employee employee);
	
	public abstract List<Employee> fetchAllEmployee(); 
	
	public abstract Employee fetchEmployee(Integer id);
	
	public abstract Integer updateEmployee(Integer id,Employee employee);
	
	public abstract Boolean deleteEmployee(Integer id);
	
	
}
