package com.raja.dataJpaRelations.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raja.dataJpaRelations.entities.DepartmentEntity;
import com.raja.dataJpaRelations.repositories.DepartmentRepository;

@Service
public class DepartmentServiceImpl {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public List<DepartmentEntity> getAllDepartments() {
		return departmentRepository.findAll();
		
	}
	
	public void   deleteDepartmentById(Integer id) {
	 departmentRepository.deleteById(id);
		
	}

}
