package com.crud.view;

import com.crud.controller.BusinessController;
import com.crud.controller.BusinessController.Colour;
import com.crud.controller.BusinessController.Material;

abstract class MainTest {

	public static void main(String[] args) {
		
		BusinessController c = new BusinessController();
		c.createBusiness("Navarro");
		c.getAllBusiness().forEach(System.out::println);
		c.createDecoration(Material.Plastic, 20.0, "1");
		c.createFlower(Colour.Blue, 5.0, "1");
		c.createTree(1.5, 33.50, "naVaRro");
		c.createFlower(Colour.Red, 2.0, "NAVARRO");
		c.createDecoration(Material.Wood, 10.0, "navarro");
		c.createTree(2.3, 50.75, "1");
		c.createFlower(Colour.Yellow, 3.0, "Navarro");
		c.createTree(1.5, 33.50, "one");
		c.getAllBusiness().forEach(System.out::println);
		c.showStock("1");
		
	}

}
