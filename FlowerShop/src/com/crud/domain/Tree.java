package com.crud.domain;

public class Tree extends ObjectForSale {

    public double height;

    public Tree(double height,double price){
        super(price);
        this.height = height;
    }

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tree [");
		builder.append("ID()=");
		builder.append(getId());
		builder.append(", Height=");
		builder.append(height);
		builder.append(", Price()=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
}
