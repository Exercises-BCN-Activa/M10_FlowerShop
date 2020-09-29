package com.front.domain;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.crud.controller.BusinessController;
import com.front.utilities.Inputs;

/**
 * @author FaunoGuazina & pierorepp90
 *
 */
public class Window extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private BusinessController bC = new BusinessController();
	private JLabel stock;
	private JButton createFlowerShop, addTree, addFlower, addDeco, showStock;
	static JTextField flowerName, flowerColour, flowerPrice, treeName, treeHeight, treePrice, decoName, decoType,
			decoPrice, businessName;

	/**
	 * 
	 */
	public Window() {
		super();
		configureWindow();
		initializeComponents();

	}

	/**
	 * 
	 */
	private void configureWindow() {
		this.setTitle("Flower Business");
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * 
	 */
	private void initializeComponents() {

		stock = new JLabel("Flowers Shop");
		createFlowerShop = new JButton("Create Business");
		addTree = new JButton("Tree");
		addFlower = new JButton("Flower");
		addDeco = new JButton("Decoration");
		showStock = new JButton("Show Stock");
		flowerName = new JTextField(20);
		flowerColour = new JTextField(20);
		flowerPrice = new JTextField(20);
		treeName = new JTextField(20);
		treeHeight = new JTextField(20);
		treePrice = new JTextField(20);
		decoName = new JTextField(20);
		decoType = new JTextField(20);
		decoPrice = new JTextField(20);
		businessName = new JTextField(30);

		stock.setBounds(100, 10, 200, 20);
		createFlowerShop.setBounds(100, 280, 200, 50);
		createFlowerShop.addActionListener(this);
		addTree.setBounds(200, 340, 100, 50);
		addTree.addActionListener(this);
		addFlower.setBounds(350, 340, 100, 50);
		addFlower.addActionListener(this);
		addDeco.setBounds(500, 340, 100, 50);
		addDeco.addActionListener(this);
		showStock.setBounds(100, 230, 200, 50);
		showStock.addActionListener(this);
		flowerName.setBounds(350, 390, 60, 20);
		flowerColour.setBounds(410, 390, 60, 20);
		flowerPrice.setBounds(410, 410, 40, 20);
		treeName.setBounds(200, 390, 60, 20);
		treeHeight.setBounds(260, 390, 60, 20);
		treePrice.setBounds(260, 410, 40, 20);
		decoName.setBounds(500, 390, 60, 20);
		decoType.setBounds(560, 390, 60, 20);
		decoPrice.setBounds(560, 410, 40, 20);

		businessName.setBounds(300, 100, 100, 20);

		this.add(stock);

		this.add(createFlowerShop);
		this.add(addTree);
		this.add(addFlower);
		this.add(addDeco);
		this.add(showStock);
		this.add(flowerName);
		flowerName.setText("Name");
		this.add(flowerColour);
		flowerColour.setText("Colour");
		this.add(flowerPrice);
		flowerPrice.setText("Price");
		this.add(treeName);
		treeName.setText("Name");
		this.add(treeHeight);
		treeHeight.setText("Height");
		this.add(treePrice);
		treePrice.setText("Price");
		this.add(decoName);
		decoName.setText("Name");
		this.add(decoType);
		decoType.setText("Wood/Plastic");
		this.add(decoPrice);
		decoPrice.setText("Price");
		this.add(businessName);
		businessName.setText("Insert name");

	}

	/**
	 *
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == createFlowerShop) {
			bC.createBusiness(Inputs.toTitleCase(businessName.getText()));

		}
		if (e.getSource() == addTree) {
			String treeNameString = Inputs.toTitleCase(treeName.getText()); 
			double treeHeightDouble = Inputs.toDouble(treeHeight.getText());
			double treePriceDouble = Inputs.toDouble(treePrice.getText());
			
			if(treeHeightDouble >= 0 && treePriceDouble >= 0) {
				bC.createTree(treeNameString, treeHeightDouble, treePriceDouble, businessName.getText());
			} else {
				System.out.println("Height and value must be numeric characters,\ndecimal separator must be a dot not a comma!");
			}

			treeHeight.setText("");
			treeName.setText("");
			treePrice.setText("");
		}
		if (e.getSource() == addFlower) {
			String flowerNameString = Inputs.toTitleCase(flowerName.getText()); 

			double flowerPriceDouble = Inputs.toDouble(flowerPrice.getText());

			if (Inputs.validColor(flowerNameString) && flowerPriceDouble >= 0) {
				bC.createFlower(flowerNameString, Inputs.toColor(flowerNameString), flowerPriceDouble, businessName.getText());
			} else {
				System.out.println("Available colours are Red, Green, Blue, Yellow");
			}

			flowerName.setText("");
			flowerPrice.setText("");
			flowerColour.setText("");
		}
		if (e.getSource() == addDeco) {
			String decoNameString = Inputs.toTitleCase(decoName.getText()); 
			double decoPriceDouble = Inputs.toDouble(decoPrice.getText());

			if (Inputs.validMaterial(decoNameString) && decoPriceDouble >= 0) {
				bC.createDecoration(decoNameString, BusinessController.Material.Wood, decoPriceDouble, businessName.getText());
			} else {
				System.out.println("Decoration type must be Wood or Plastic");
			}

			decoType.setText("");
			decoName.setText("");
			decoPrice.setText("");

		}
		if (e.getSource() == showStock) {
			bC.showStock(Inputs.toTitleCase(businessName.getText()));
		}
	}
}
