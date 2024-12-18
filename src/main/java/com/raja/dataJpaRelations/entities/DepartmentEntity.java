package com.raja.dataJpaRelations.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity(name="department")
@Data
//@JsonIdentityInfo(
//	    generator = ObjectIdGenerators.PropertyGenerator.class,
//	    property = "id"
//	)
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String depName;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<EmployeeEntity> employees;
	
	

}
