package com.crud.persistence;

import com.crud.domain.Business;

import java.util.ArrayList;
import java.util.List;

public final class BusinessRepository {
	private static List<Business> stores = new ArrayList<>();
	
	public BusinessRepository(){
		
	}
	
	public List<Business> getAllBusiness(){
		return stores;
	}
	
	public void addBusiness(Business store) {
		stores.add(store);
	}

	public Business findBusiness(int id) {
		Business finded = null;
		for (Business b : stores) {
			if (b.getId()==id) {
				finded = b;
			}
		}
		return finded;
	}	
	
	public Business findBusiness(String name) {
		Business finded = null;
		for (Business b : stores) {
			if (b.getName().equalsIgnoreCase(name)) {
				finded = b;
			}
		}
		return finded;
		
	}
	
}
