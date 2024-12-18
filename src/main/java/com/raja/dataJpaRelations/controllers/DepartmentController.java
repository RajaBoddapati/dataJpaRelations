package com.raja.dataJpaRelations.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raja.dataJpaRelations.entities.DepartmentEntity;
import com.raja.dataJpaRelations.servicesImpl.DepartmentServiceImpl;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	DepartmentServiceImpl  departmentServiceImpl;
	
	@GetMapping
	public List<DepartmentEntity> getAllDepartments(){
		return departmentServiceImpl.getAllDepartments();
	}
	
	@DeleteMapping("/{id}")
	public void deleteDepartmentById(@PathVariable Integer id) {
		departmentServiceImpl.deleteDepartmentById(id);
		
	}

}
