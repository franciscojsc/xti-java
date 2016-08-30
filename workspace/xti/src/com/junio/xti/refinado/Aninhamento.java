package com.junio.xti.refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {
	
	JButton botao;

	public Aninhamento() {
		super("Aninhameno");

		botao = new JButton("Ok");
		botao.addActionListener(new ListenerAlinhado());
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Anônima processa "+ botao.getText());

			}
		});
		
		getContentPane().add(botao);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public class ListenerAlinhado implements ActionListener{//classe aninhada

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Classe Aninhada processa "+ botao.getText());
		}
		
		
	}
	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
		//classe envolvente
		Aninhamento.ListenerAlinhado listenerAlinhado = janela.new ListenerAlinhado();
		
		
		
	}

}
