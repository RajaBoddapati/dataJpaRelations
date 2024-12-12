package com.raja.dataJpaRelations.servicesImpl;

import org.springframework.stereotype.Service;

import com.raja.dataJpaRelations.repositories.AddressRepository;

@Service
public class AddressServiceImpl {
	
	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}
	
	public void deleteAddressById(Integer id) {
		addressRepository.deleteById(id);
		
	}

}
