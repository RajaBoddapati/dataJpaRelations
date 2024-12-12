package com.raja.dataJpaRelations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.dataJpaRelations.entities.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
