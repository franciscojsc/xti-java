package com.junio.aulaXTI;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {

		String[] paises = { "Brasil", "Russia", "India", "China" };// array de
																	// objeto
		System.out.println(Arrays.toString(paises));// exibir todos elementos do
													// array

		// pesquisa dentro do array pelo nome do elementos
		int posicao = Arrays.binarySearch(paises, "RUssia");
		System.out.println(posicao);

		// ordenação de array da primeira a ultima posição
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));

		System.out.println(paises[0]);
		paises[0] = "Brazil";
		System.out.println(paises[0]);
		System.out.println(paises.length);// quantidade de elementos do array

		int[] impares = new int[5];// array de tipo primitivo
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;

		// pode-se acessa metodos de objetos diretamente no array
		Double[] valores = { 12.32, 3452.4352 };
		System.out.println(valores[0].doubleValue());

	}

}
