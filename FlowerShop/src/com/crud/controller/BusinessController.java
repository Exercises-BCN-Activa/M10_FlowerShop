package com.crud.controller;

import com.crud.persistence.BusinessRepository;

public final class BusinessController {
	
	private BusinessRepository repository = new BusinessRepository();
	
	public BusinessController() {}
	
	public void createBusiness() {
		
	}
	
	public void showBusiness() {
		repository.getAllBusiness().forEach(System.out::println);
	}
	
	public void createDecoration() {
		
	}
	
	public void createFlower() {
		
	}
	
	public void createTree() {
		
	}

}
