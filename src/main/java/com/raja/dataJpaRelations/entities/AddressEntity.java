package com.raja.dataJpaRelations.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;

@Entity(name = "address")
@ToString
@Data
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int pincode;

	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	 @ToString.Exclude
	@JsonBackReference
	private EmployeeEntity employee;

}
