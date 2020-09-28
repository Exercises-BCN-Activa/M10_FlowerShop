package com.crud.controller;

import java.util.List;

public final class BusinessController {
	

	public enum Material {
		Plastic, Wood;
	}
	
	public enum Colour {
		Red, Green, Blue, Yellow;
	}

	private final StockManager manager;

	public BusinessController() {
		manager = new StockManager();
	}

	public void createBusiness(String name) {
		manager.createBusiness(name);
	}

	public List<?> getAllBusiness() {
		return manager.getAllBusiness();
	}

	public Object getStore(String idORname) {
		return manager.findBusiness(idORname);
	}

	public void createDecoration(Material material, double price, String Store) {
		manager.createDecoration(material.toString(), price, Store);
	}

	public void createFlower(Colour colour, double price, String Store) {
		manager.createFlower(colour.toString(), price, Store);
	}

	public void createTree(double height, double price, String Store) {
		manager.createTree(height, price, Store);
	}

	public void showStock(String Store) {
		manager.showStock(Store);
	}

}
