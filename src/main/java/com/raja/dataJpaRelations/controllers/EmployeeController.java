package com.raja.dataJpaRelations.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raja.dataJpaRelations.entities.EmployeeEntity;
import com.raja.dataJpaRelations.servicesImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	EmployeeServiceImpl employeeServiceImpl;

	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}

	@GetMapping
	public List<EmployeeEntity> getAllEmployees() {
		return employeeServiceImpl.getAllEmployees();
	}

	@GetMapping("/{id}")
	public EmployeeEntity getEmployeeById(@PathVariable Integer id) {
		return employeeServiceImpl.getEmployeeById(id);
	}

	@PostMapping
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return employeeServiceImpl.addEmployee(employeeEntity);

	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		employeeServiceImpl.deleteEmployeeById(id);
		
	}

}
