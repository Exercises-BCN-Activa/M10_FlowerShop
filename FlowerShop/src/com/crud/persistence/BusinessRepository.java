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
}
