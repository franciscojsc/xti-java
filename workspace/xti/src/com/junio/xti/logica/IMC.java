package com.junio.xti.logica;

import java.text.DecimalFormat; 

import javax.swing.JOptionPane;

/**
 * 
 * Calcular o IMC IMC = pesoQulogramas / alturaEmMetros * AlturaEmMetros
 *
 */
public class IMC {

	public static void main(String[] args) {

		String peso = JOptionPane.showInputDialog("Entre com o seu peso em quilograma:");
		String altura = JOptionPane.showInputDialog("Entre com o sua altura em metros:");

		double pesoQuilogramas = Double.parseDouble(peso);
		double alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoQuilogramas / (alturaEmMetros * alturaEmMetros);

		DecimalFormat df = new DecimalFormat("###,###.##");
		

		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "nao ideal ";
		msg = "IMC = " + df.format(imc) + "\n" + msg;
		JOptionPane.showMessageDialog(null, msg);

	}

}
