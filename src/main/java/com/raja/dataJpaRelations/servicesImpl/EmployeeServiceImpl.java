package com.raja.dataJpaRelations.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raja.dataJpaRelations.entities.DepartmentEntity;
import com.raja.dataJpaRelations.entities.EmployeeEntity;
import com.raja.dataJpaRelations.repositories.DepartmentRepository;
import com.raja.dataJpaRelations.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl {

	private EmployeeRepository  employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeEntity addEmployee(EmployeeEntity employeeEntity) {
		System.out.println(employeeEntity);
		DepartmentEntity department = employeeEntity.getDepartment();
		if(department!=null) {
			DepartmentEntity findByDepName = departmentRepository.findByDepName(department.getDepName());
			if(findByDepName==null) {
				departmentRepository.save(department);
			}
			else {
				employeeEntity.setDepartment(findByDepName);
			}
			
		}
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
