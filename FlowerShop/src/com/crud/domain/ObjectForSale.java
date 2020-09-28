package com.crud.domain;

public abstract class ObjectForSale {

    private double price;
    private int id;
    private static int counterId = 1;

    public ObjectForSale(double price){
        this.price = price;
        id = counterId;
        ObjectForSale.counterId++;
    }
    
    public int getId() {
    	return id;
    }

    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }

}
