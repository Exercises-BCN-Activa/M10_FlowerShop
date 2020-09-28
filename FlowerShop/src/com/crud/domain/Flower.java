package com.crud.domain;

public class Flower extends ObjectForSale{

    private String colour;

    public Flower(String colour, double price){
        super(price);
        this.colour = colour;
    }

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flower [");
		builder.append("ID()=");
		builder.append(getId());
		builder.append(", colour=");
		builder.append(colour);
		builder.append(", Price()=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
}
