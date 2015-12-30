package com.junio.aulaXTI;

import java.util.Random;
import java.util.Scanner;

public class JogoDados {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("-------------Jogo de dados-------------\n\n");
		System.out.println("Qual o seu palpite 1-6 ? ");
		int palpite = teclado.nextInt();

		Random r = new Random();
		int dado = r.nextInt(6) + 1;// 0-5

		System.out.println("\nPalpite " + palpite);
		System.out.println("Dado " + dado);

		if (palpite == dado) {
			System.out.println("\n Acertou");
		} else {
			System.out.println("\n Errou");
		}
	}

}
