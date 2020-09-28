package com.crud.controller;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.crud.persistence.BusinessRepository;

import com.crud.domain.Business;
import com.crud.domain.Decoration;
import com.crud.domain.Flower;
import com.crud.domain.ObjectForSale;
import com.crud.domain.Tree;


final class StockManager {

	private final BusinessRepository repository = new BusinessRepository();

	StockManager() {
	}

	void createBusiness(String name) {
		repository.addBusiness(Factory.createBusiness(name));
	}
	
	public List<Business> getAllBusiness() {
		return repository.getAllBusiness();
	}
	
	Business findBusiness(String Store) {
		Business store = null;
		try {
			Stream<Business> s = repository.getAllBusiness().stream();
			s = (Store.chars().allMatch(Character::isDigit))
					? s.filter(b -> b.getId() == Integer.parseInt(Store))
							: s.filter(b -> b.getName().equalsIgnoreCase(Store));
			store = s.findFirst().get();
		} catch (Exception e) {
			System.out.println("NoSuchElementException: Store not founded!");
		}
		return store;
	}

	void createDecoration(String woodOrPlastic, double price, String Store) {
		Business store = findBusiness(Store);
		if (store != null) {
			store.addStock(Factory.createDecoration(woodOrPlastic, price));
		}
	}

	void createFlower(String colour, double price, String Store) {
		Business store = findBusiness(Store);
		if (store != null) {
			store.addStock(Factory.createFlower(colour, price));
		}
	}

	void createTree(double height, double price, String Store) {
		Business store = findBusiness(Store);
		if (store != null) {
			store.addStock(Factory.createTree(height, price));
		}
	}

	void showStock(String Store) {
		Business store = findBusiness(Store);
		
		System.out.println("\n====================================================\n");
		
		System.out.println("Stock of " + store.getName() + 
				" | Total amount Itens: " + store.getStock().size());
		
		printTypeStock("Decoration", store, new Decoration("", 0));
		printTypeStock("Flowers", store, new Flower("", 0));
		printTypeStock("Tree", store, new Tree(0, 0));

		System.out.println("\n====================================================\n");
	}
	
	private void printTypeStock(String type, Business store, ObjectForSale item) {
		List<ObjectForSale> stock = store.getStock().stream()
				.filter(x -> x.getClass().equals(item.getClass()))
				.collect(Collectors.toList());
		System.out.println("\n" + type + ": " + stock.size() + " itens");
		stock.forEach(System.out::println);
	}

	private static class Factory {

		static Business createBusiness(String name) {
			return new Business(name);
		}

		static Decoration createDecoration(String material, double price) {
			return new Decoration(material, price);
		}

		static Flower createFlower(String colour, double price) {
			return new Flower(colour, price);
		}

		static Tree createTree(double height, double price) {
			return new Tree(height, price);
		}
	}

}
