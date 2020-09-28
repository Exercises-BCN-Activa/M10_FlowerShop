package com.crud.controller;

import java.util.List;

import com.crud.domain.Business;
import com.crud.persistence.BusinessRepository;

public final class BusinessController {
	
	private BusinessRepository repository = new BusinessRepository();
	
	public BusinessController() {}
	
	public void createBusiness(String name) {
		repository.addBusiness(BusinessFactory.createBusiness(name));
	}
	
	public List<Business> showBusiness() {
		repository.getAllBusiness().forEach(System.out::println);
		return repository.getAllBusiness();
	}
	
	private Business findBusiness(int id) {
		return repository.findBusiness(id);
	}	
	
	private Business findBusiness(String name) {
		return repository.findBusiness(name);
	}
	
	public void createDecoration(String woodOrPlastic, double price, int id) {
		Business store = findBusiness(id);
		store.addStock(BusinessFactory.createDecoration(woodOrPlastic, price));
	}
	
	public void createDecoration(String woodOrPlastic, double price, String name) {
		Business store = findBusiness(name);
		store.addStock(BusinessFactory.createDecoration(woodOrPlastic, price));
	}
	
	public void createFlower(String colour, double price, int id) {
		Business store = findBusiness(id);
		store.addStock(BusinessFactory.createFlower(colour, price));
	}
	
	public void createFlower(String colour, double price, String name) {
		Business store = findBusiness(name);
		store.addStock(BusinessFactory.createFlower(colour, price));
	}
	
	public void createTree(double height,double price, int id) {
		Business store = findBusiness(id);
		store.addStock(BusinessFactory.createTree(height, price));
	}
	
	public void createTree(double height,double price, String name) {
		Business store = findBusiness(name);
		store.addStock(BusinessFactory.createTree(height, price));
	}

}
