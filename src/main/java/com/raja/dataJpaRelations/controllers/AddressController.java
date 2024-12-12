package com.raja.dataJpaRelations.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raja.dataJpaRelations.servicesImpl.AddressServiceImpl;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	private AddressServiceImpl addressServiceImpl;
	
	
	
	public AddressController(AddressServiceImpl addressServiceImpl) {
		super();
		this.addressServiceImpl = addressServiceImpl;
	}



	@DeleteMapping("/{id}")
	public void deleteAddressById(@PathVariable Integer id) {
		addressServiceImpl.deleteAddressById(id);
	}

}
