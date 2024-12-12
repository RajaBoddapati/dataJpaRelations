package com.raja.dataJpaRelations.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "address")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	private int pincode;
	
    @OneToOne(mappedBy = "address")
    @JsonBackReference
	private EmployeeEntity employee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	public EmployeeEntity getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, id, pincode, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AddressEntity other = (AddressEntity) obj;
		return Objects.equals(city, other.city) && id == other.id && pincode == other.pincode
				&& Objects.equals(state, other.state);
	}
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ ", employee=" + employee + "]";
	}
	
	
	
	

}
