package com.crud.domain;

public class Decoration extends ObjectForSale {

    private String woodOrPlastic;

    public Decoration(String woodOrPlastic, double price){
        super(price);
        this.woodOrPlastic = woodOrPlastic;
    }

	public String getWoodOrPlastic() {
		return woodOrPlastic;
	}

	public void setWoodOrPlastic(String woodOrPlastic) {
		this.woodOrPlastic = woodOrPlastic;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Decoration [");
		builder.append("ID=");
		builder.append(getId());
		builder.append(", Material=");
		builder.append(woodOrPlastic);
		builder.append(", Price=");
		builder.append(getPrice());
		builder.append("]");
		return builder.toString();
	}
    
    
}
