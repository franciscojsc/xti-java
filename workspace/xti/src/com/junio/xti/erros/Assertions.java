package com.junio.xti.erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Entre um numero de 0 a 10");
		int numero = teclado.nextInt();
		
		assert(numero >= 0 && numero <=10):"Numero invalido";
		
		System.out.println("Voce entrou "+ numero);
	}

}
