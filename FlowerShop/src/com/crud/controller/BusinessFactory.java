package com.crud.controller;

import com.crud.domain.*;

final class BusinessFactory {
	
	BusinessFactory(){}
	
	static Business createBusiness(String name) {
		return new Business(name);
	}
	
	static Decoration createDecoration(String woodOrPlastic, double price) {
		return new Decoration(woodOrPlastic, price);
	}
	
	static Flower createFlower(String colour, double price) {
		return new Flower(colour, price);
	}
	
	static Tree createTree(double height,double price) {
		return new Tree(height, price);
	}

}
