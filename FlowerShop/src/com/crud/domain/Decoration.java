package com.crud.domain;

public class Decoration extends ObjectForSale {

    public String woodOrPlastic;

    public Decoration(String woodOrPlastic, double price){
        super(price);
        this.woodOrPlastic = woodOrPlastic;
    }
}
