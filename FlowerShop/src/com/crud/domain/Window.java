package com.crud.domain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame implements ActionListener {

    private JLabel stock;
    private JButton createFlowerShop, addTree, addFlower, addDeco,showStock;
    static JTextField flowerName,flowerColour,treeName,treeHeight,decoName,decoType,businessName;
    public Window() {
        super();
        configureWindow();
        initializeComponents();
    }

    private void configureWindow() {
        this.setTitle("Flower Business");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initializeComponents() {

        stock = new JLabel("Stock in the Flowers Shop");
        createFlowerShop = new JButton("Business");
        addTree = new JButton("Tree");
        addFlower = new JButton("Flower");
        addDeco = new JButton("Decoration");
        showStock = new JButton("Show Stock");
        flowerName = new JTextField(20);
        flowerColour = new JTextField(20);
        treeName = new JTextField(20);
        treeHeight = new JTextField(20);
        decoName = new JTextField(20);
        decoType = new JTextField(20);
        businessName = new JTextField(30);

        stock.setBounds(300, 10, 200, 250);
        createFlowerShop.setBounds(100, 230, 100, 50);
        createFlowerShop.addActionListener(this);
        addTree.setBounds(200, 340, 100, 50);
        addTree.addActionListener(this);
        addFlower.setBounds(350, 340, 100, 50);
        addFlower.addActionListener(this);
        addDeco.setBounds(500, 340, 100, 50);
        addDeco.addActionListener(this);
        showStock.setBounds(320, 200, 200, 50);
        showStock.addActionListener(this);
        flowerName.setBounds(350, 390, 60, 20);
        flowerColour.setBounds(410, 390, 60, 20);
        treeName.setBounds(200, 390, 60, 20);
        treeHeight.setBounds(260, 390, 60, 20);
        decoName.setBounds(500, 390, 60, 20);
        decoType.setBounds(560, 390, 60, 20);
        businessName.setBounds(100, 280,100,20);
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
        this.add(treeName);
        treeName.setText("Name");
        this.add(treeHeight);
        treeHeight.setText("Height");
        this.add(decoName);
        decoName.setText("Name");
        this.add(decoType);
        decoType.setText("Wood/Plastic");
        this.add(businessName);
        businessName.setText("Insert name");


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==createFlowerShop) {
            String businessNameString = businessName.getText();
            businessName.setText("");
        }
        if (e.getSource()==addTree) {
            String treeNameString = treeName.getText();
            treeName.setText("");
            double treeHeightDouble = Double.parseDouble(treeHeight.getText());
            treeHeight.setText("");

        }
        if (e.getSource()==addFlower) {
            String flowerNameString = flowerName.getText();
            flowerName.setText("");
            String flowerColourString = flowerColour.getText();
            flowerColour.setText("");

        }
        if (e.getSource()==addDeco) {
            String decoNameString = decoName.getText();
            decoName.setText("");
            String decoTypeString = decoType.getText();
            decoType.setText("");

        }
        if(e.getSource()==showStock){

        }
    }
}
