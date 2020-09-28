package com.crud.domain;

public abstract class ObjectForSale {

    double price;
    private int id;
    int counter = 0;

    public ObjectForSale(double price){
        this.price = price;
        this.idMaker();
    }

    private void idMaker(){
        this.counter += 1;
        this.id = this.counter;

    }

    public double getPrice(){
        return this.price;
    }

}
