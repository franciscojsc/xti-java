package com.junio.aulaXTI;

public class OperadorDeComparacao {

	public static void main(String[] args) {

		int x = 6;

		System.out.println(x == 6); // operador de comparacao
		System.out.println(x != 7); // verificar se e diferente
		System.out.println(x > 7);// maior que
		System.out.println(x < 7);// menor que
		System.out.println(x >= 7);// maior ou igual
		System.out.println(x <= 7);// menor ou igual

		Integer t = new Integer(6);
		// Integer t = 6 ; A partir da vresao 7

		System.out.println(t instanceof Integer);// compara o tipo do objeto
		System.out.println("oi" instanceof String);

	}

}
