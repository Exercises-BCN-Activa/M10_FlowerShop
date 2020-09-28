package com.crud.domain;

public class Decoration extends ObjectForSale {

    private String material;
    
    public Decoration(String material, double price){
    	super(price);
    	this.material = material;
    }

	public String getWoodOrPlastic() {
		return material;
	}

	public void setWoodOrPlastic(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Decoration [");
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Material=");
		builder.append(material);
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
}
