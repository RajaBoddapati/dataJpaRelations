package com.raja.dataJpaRelations.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity(name = "employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private double salary;
	private String city;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
//	@JsonIgnore
	@JsonManagedReference
	private AddressEntity address;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Id, city, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		return Id == other.Id && Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "EmployeeEntity [Id=" + Id + ", name=" + name + ", salary=" + salary + ", city=" + city + ", address="
				+ address + "]";
	}
	
	

}
