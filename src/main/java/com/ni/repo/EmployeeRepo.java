package com.ni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ni.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
