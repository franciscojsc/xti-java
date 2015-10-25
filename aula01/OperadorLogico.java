package com.junio.aulaXTI;

public class OperadorLogico {

	public static void main(String[] args) {

		int x = 6;

		System.out.println((x >= 1));
		
		// utilizar tabela verdade
		System.out.println((x >= 1)||(x>=6));
		System.out.println((x >= 1)&&(x>=6));
		System.out.println(!(x >= 1));//operador de nega��o
		
	}

}
