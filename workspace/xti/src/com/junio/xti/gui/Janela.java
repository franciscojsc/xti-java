package com.junio.xti.gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela{

	public Janela(){
		JFrame frame = new JFrame();//janela
		
		JButton botao = new JButton("Clique");//botao 
		frame.getContentPane().add(botao);//container
		
		frame.setTitle("Minha Janela");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//quando o usuario clica em fecha a janela a aplicação sera encerrada
		frame.setSize(300, 300);//tamanho da janela
		frame.setVisible(true);//visibilidade
	}
	
	public static void main(String[] args) {
		new Janela();
		
	}

}