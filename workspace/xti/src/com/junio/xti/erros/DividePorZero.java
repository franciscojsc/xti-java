package com.junio.xti.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean continua = false;

		do {
			try {

				System.out.println("Numero: ");
				int a = teclado.nextInt();
				System.out.println("Divisor: ");
				int b = teclado.nextInt();

				System.out.println(a / b);

				continua = true;

			} catch (ArithmeticException |InputMismatchException e1 ) {
				System.err.println("Numeros invalido");
				teclado.nextLine();// descarta a entrada errada e libera novamente para o usuario
									 
			}finally {
				System.out.println("Finally executado...");//sempre é executado
			}

		} while (!continua);

	}

}
