package com.junio.xti.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = { new ImageIcon(getClass().getResource("fotos/01.jpg")),
			new ImageIcon(getClass().getResource("fotos/02.jpg")),
			new ImageIcon(getClass().getResource("fotos/03.jpg")),
			new ImageIcon(getClass().getResource("fotos/04.jpg")) };

	public ControleCombo() {
		super("Album de Fotos");

		Container c = getContentPane();
		combo = new JComboBox<>();
		combo.setFont(new Font("Serif", Font.PLAIN, 25));
		combo.addItem("Bra�o");
		combo.addItem("�tica olho azul");
		combo.addItem("sol");
		combo.addItem("hipnotizado");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH,combo);
		c.add(BorderLayout.CENTER,label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {

		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED){
				label.setIcon(imagens[combo.getSelectedIndex()]);
			}
		
	}

}
