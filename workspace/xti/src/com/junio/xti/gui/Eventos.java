package com.junio.xti.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	JButton botao ;

	public Eventos() {
		super("Eventos");

		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);
		getContentPane().add(botao);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Foi clicado");
	}

	public static void main(String[] args) {

		new Eventos();
	}

}
