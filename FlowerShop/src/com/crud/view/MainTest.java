package com.crud.view;

import com.crud.controller.BusinessController;
import com.crud.controller.BusinessController.Color;
import com.crud.controller.BusinessController.Material;

abstract class MainTest {

	public static void main(String[] args) {
		
		BusinessController c = new BusinessController();		//controller instance
		c.createBusiness("Navarro");							//store creation
		c.getAllBusiness().forEach(System.out::println);		//show stock: zeroed for now 
		c.createDecoration(Material.Plastic, 20.0, "1");		//products creations: 
		c.createFlower(Color.Blue, 5.0, "1");
		c.createTree(1.5, 33.50, "naVaRro");
		c.createFlower(Color.Red, 2.0, "NAVARRO");
		c.createDecoration(Material.Wood, 10.0, "navarro");
		c.createTree(2.3, 50.75, "1");
		c.createFlower(Color.Yellow, 3.0, "Navarro");
		c.createTree(1.5, 33.50, "one");						//product creation: with error!
		c.getAllBusiness().forEach(System.out::println);		//show stock: fully now 
		c.showStock("one");										//stock detailing
		c.showStock("1");										//stock detailing: with error!
		
	}

}