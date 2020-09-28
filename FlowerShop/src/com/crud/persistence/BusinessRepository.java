package com.crud.persistence;

import com.crud.domain.Business;

import java.util.ArrayList;
import java.util.List;

public final class BusinessRepository {

	private static List<Business> stores;

	public BusinessRepository() {
		stores = new ArrayList<>();
	}

	public List<Business> getAllBusiness() {
		return new ArrayList<>(stores);
	}

	public void addBusiness(Business store) {
		if (store != null) {
			stores.add(store);
		} else {
			System.out.println("Store cannot be created!");
		}
	}

}
