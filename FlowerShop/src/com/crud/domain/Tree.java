package com.floristeria.domain;

public class Tree extends ObjectForSale {

    public double height;

    public Tree(double height,double price){
        super(price);
        this.height = height;
    }
}
