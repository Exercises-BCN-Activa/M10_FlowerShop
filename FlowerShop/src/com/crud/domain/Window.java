package com.crud.domain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame implements ActionListener {

    private JLabel stock;
    private JButton createFlowerShop, addTree, addFlower, addDeco,showStock;
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


        stock.setBounds(300, 10, 200, 250);
        createFlowerShop.setBounds(100, 250, 100, 50);
        createFlowerShop.addActionListener(this);
        addTree.setBounds(210, 370, 100, 50);
        addTree.addActionListener(this);
        addFlower.setBounds(320, 370, 100, 50);
        addFlower.addActionListener(this);
        addDeco.setBounds(430, 370, 100, 50);
        addDeco.addActionListener(this);
        showStock.setBounds(320, 200, 200, 50);
        showStock.addActionListener(this);


        this.add(stock);

        this.add(createFlowerShop);
        this.add(addTree);
        this.add(addFlower);
        this.add(addDeco);
        this.add(showStock);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==createFlowerShop) {

        }
        if (e.getSource()==addTree) {

        }
        if (e.getSource()==addFlower) {

        }
        if (e.getSource()==addDeco) {

        }
        if(e.getSource()==showStock){

        }
    }
}
