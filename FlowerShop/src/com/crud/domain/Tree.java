package com.crud.domain;

/**
 * class that builds a tree product.
 * extends class ObjectForSale,
 * increments the height attribute.
 * @author FaunoGuazina & pierorepp90
 *
 */
public class Tree extends ObjectForSale {

    public double height;

    /**
     * only constructor
     * @param height double value
     * @param price double value (super constructor)
     */
    public Tree(double height,double price){
        super(price);
        this.height = height;
    }
    
    //Getter and Setter
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
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Height=");
		builder.append(height);
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
}
