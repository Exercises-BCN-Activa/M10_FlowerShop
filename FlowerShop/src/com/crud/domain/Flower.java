package com.crud.domain;

public class Flower extends ObjectForSale{

    public String colour;

    public Flower(String colour, double price){
        super(price);
        this.colour = colour;
    }
}
