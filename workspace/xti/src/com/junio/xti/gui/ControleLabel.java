package com.junio.xti.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{

	public ControleLabel() {
		super("Label");
		Container c = getContentPane();
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu Tooltip");//texto que aparece quando passa o mouse emcima do label
		
		Font fonte = new Font("serifa",Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/logo_marca.png"));
		JLabel imagem = new JLabel(icon);
		
		
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label );
		c.add(imagem);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ControleLabel();
		
	}

}
