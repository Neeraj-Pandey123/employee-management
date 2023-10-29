package com.ni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ni.model.Employee;
import com.ni.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee emp) {
		Integer id =service.saveEmployee(emp);
		String msg = "Employee saved with Id "+id;
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> fetchAllEmployee() {
		List<Employee> fetchAllEmployee = service.fetchAllEmployee();
		return new ResponseEntity<>(fetchAllEmployee,HttpStatus.OK);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> fetchEmployee(@PathVariable("id") Integer id) {
		Employee emp = service.fetchEmployee(id);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable("id") Integer id,@RequestBody Employee emp) {
		Integer updateEmployee = service.updateEmployee(id,emp);
		String msg = "Emplyee with id "+updateEmployee +" is updated";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") Integer id){
		String msg = null;
		Boolean deleteEmployee = service.deleteEmployee(id);
		if(deleteEmployee)
		   msg = "Emplyee deleted";
		else
		   msg = "Something went wrong";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
}
