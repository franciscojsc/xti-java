package com.junio.xti.poo;

public class Matematica {

	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

	double somar(double um, double dois) {
		double s = um + dois;
		return s;
	}

	String pares(int num1, int num2, int num3) {
		String par = "";
		int[] vetor = new int[3];
		vetor[0] = num1;
		vetor[1] = num2;
		vetor[2] = num3;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				int x = vetor[i];
				par += " " + x + " ";
				;
			}
		}
		return par;
	}

	String impar(int num1, int num2, int num3) {
		String impares = "";
		int[] vetor = new int[3];
		vetor[0] = num1;
		vetor[1] = num2;
		vetor[2] = num3;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				int x = vetor[i];
				impares += " " + x + " ";
				;
			}
		}
		return impares;
	}

	/**
	 * @return a raiz quadrada no numero segundo equacao se pells
	 * 
	 * @param numero
	 * @return
	 */

	int raiz(int numero) {
		int raiz = 0, impar = 1;
		while (numero >= impar) {
			numero -= impar;
			impar += 2;// proximo numero impar
			++raiz;
		}
		return raiz;
	}
}
