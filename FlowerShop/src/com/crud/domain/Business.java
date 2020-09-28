package com.crud.domain;

import java.util.ArrayList;
import java.util.List;

public class Business {

    private String name;
    private List<ObjectForSale> stock = new ArrayList<>();
    private int id;
    private static int counterId = 1;
    
    public Business(String name){
        this.name = name;
        id = counterId;
        Business.counterId++;
    }
    
    public int getId() {
    	return id;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ObjectForSale> getStock() {
		return stock;
	}

	public void setStock(List<ObjectForSale> stock) {
		this.stock = stock;
	}
	
	public void addStock(ObjectForSale itemStock) {
		stock.add(itemStock);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Business [name=");
		builder.append(name);
		builder.append(", stock=");
		builder.append(stock.size());
		builder.append(" itens]");
		return builder.toString();
	}
    
    
    
}
