package com.raja.dataJpaRelations.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity(name = "employee")
@ToString
@Data
//@JsonIdentityInfo(
//	    generator = ObjectIdGenerators.PropertyGenerator.class,
//	    property = "id"
//	)
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private double salary;
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "address")
	@ToString.Exclude
	@JsonManagedReference
//	@JsonIgnore
	private AddressEntity address;
	
	 @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 @JoinColumn(name = "department_id", nullable = false)
	 @JsonBackReference
	private DepartmentEntity department;
	
	
	

}
