package com.junio.xti.logica;

public class GarbageCollector {

	public static void main(String[] args) {

		// Variável Primitiva
		int x = 7;
		x = 9;

		// Variável de Referência
		String y = "XTI";
		y = "xti.com.br";
		y = null;
		
		System.out.println(y);
	}

}
