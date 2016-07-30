package com.junio.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela(){
		super("Minha Janela");
		
		JButton botao = new JButton("Clique");//botao 
		getContentPane().add(botao);//container com um botão
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando o usuario clica em fecha a janela a aplicação sera encerrada
		setSize(300, 300);//tamanho da janela
		setVisible(true);//visibilidade
	}
	
	public static void main(String[] args) {
		new Janela();
		
	}

}