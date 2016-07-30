package com.junio.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
	
	
	public Layouts() {
		super("Layouts");
		
		Container c = getContentPane();//atribuiando o container a uma variavel
		c.setLayout(new FlowLayout());//atribuindo um layout ao container
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {

		new Layouts();
		
	}

}
