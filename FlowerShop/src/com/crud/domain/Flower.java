package com.crud.domain;

/**
 * class that builds a flower product.
 * extends class ObjectForSale,
 * increments the color attribute.
 * @author FaunoGuazina & pierorepp90
 *
 */
public class Flower extends ObjectForSale{

    private String color;

    /**
     * only constructor
     * @param colour string
     * @param price double value (super constructor)
     */
    public Flower(String colour, double price){
        super(price);
        this.color = colour;
    }

    //Getter and Setter
	public String getColour() {
		return color;
	}

	public void setColour(String colour) {
		this.color = colour;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flower [");
		builder.append("ID=");
		builder.append(getId());
		builder.append(", colour=");
		builder.append(color);
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
}
