package com.junio.aulaXTI;

import java.util.Random;
import java.util.Scanner;

public class JogoBaralho {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		boolean continuar = true;

		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "VALETE", "DAMA", "REI" };
		String[] nipes = { "ESPADAS", "PAUS", "COPAS", "OUROS" };
		
		//String face = faces[r.nextInt(faces.length)];
		//String nipe = nipes[n.nextInt(nipes.length)];
		
		do {
			
		Random r = new Random();
		int indiceFace = r.nextInt(faces.length);
		String face = faces[indiceFace];

		Random n = new Random();
		int indiceNipe = n.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];

		
			String carta = face + " " + nipe;
			System.out.println(carta);

			System.out.println("Deseja continuar ? N/S");
			String valida = teclado.next();
			
			if (valida.equalsIgnoreCase("N")) {
				continuar = false;
			} else {
				continuar = true;
			}

		} while (continuar);

		System.out.println("Obrigado, volte sempre");
	}

}
