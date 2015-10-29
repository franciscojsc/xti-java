package com.junio.aulaXTI;

/**
 * 
 * Calcular o IMC IMC = pesoQulogramas / alturaEmMetros * AlturaEmMetros
 *
 */
public class IMC {

	public static void main(String[] args) {

		double pesoQuilogramas = 70;
		double alturaEmMetros = 1.76;
		double imc = pesoQuilogramas / (alturaEmMetros * alturaEmMetros);

		String msg =(imc >= 20 && imc <= 25)? "Peso Ideal" : "nao ideal "; 
		System.out.println("IMC " + imc);
		System.out.println(msg);
		
	}

}
