package com.raja.dataJpaRelations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.dataJpaRelations.entities.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer> {

	DepartmentEntity findByDepName(String depName);
}
