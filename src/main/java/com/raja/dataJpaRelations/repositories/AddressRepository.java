package com.raja.dataJpaRelations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raja.dataJpaRelations.entities.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {

}
