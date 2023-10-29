package com.ni.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ni.model.Employee;
import com.ni.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	@Autowired
	private EmployeeRepo repo;

	@Override
	public Integer saveEmployee(Employee employee) {
		Employee emp = repo.save(employee);
		return emp.getId();
	}

	@Override
	public List<Employee> fetchAllEmployee() {
		List<Employee> listEmployee= repo.findAll();
		return listEmployee;
	}
	
	@Override
	public Employee fetchEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
		    return null;
		}
		
	}

	@Override
	public Integer updateEmployee(Integer id, Employee employee) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			Employee emp = opt.get();
			emp.setType(employee.getType());
			repo.save(emp);
			return emp.getId();
		}else {
			return 0;
		}	
	}

	@Override
	public Boolean deleteEmployee(Integer id) {
		Boolean flag = true;
		try {
			repo.deleteById(id);
			return flag;
		} catch (Exception e) {
			flag = false;
            return flag;
		}
		
	}

	

}
