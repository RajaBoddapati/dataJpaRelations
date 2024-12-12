package com.raja.dataJpaRelations.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.raja.dataJpaRelations.entities.EmployeeEntity;
import com.raja.dataJpaRelations.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository  employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
		return employeeRepository.save(employeeEntity);
	}

	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public EmployeeEntity getEmployeeById(Integer id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public void deleteEmployeeById(Integer id) {
		 employeeRepository.deleteById(id);
	}
	
	
}
