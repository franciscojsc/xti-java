package com.junio.aula01;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		// chamada do programa
		// System.out.println(args[0]);

		// Interagindo com usuário
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String s = teclado.nextLine();
		System.out.println("Bem vindo " + s);

	}

}
