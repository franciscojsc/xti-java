     package com.junio.xti.logica;

import java.util.Scanner;

public class AreaCIirculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Di�metro : 2r
		double raio = 0;
		System.out.println("Entre com o raio :");
		raio = teclado.nextDouble();

		double diamentro = 2 * raio;
		System.out.println("Diametro " + diamentro);

		// Circunfer�ncia :2 PI r
		double pi = Math.PI;
		double cirferencia = 2 * pi * raio;
		System.out.println("Circufer�ncia " + cirferencia);

		// �rea PI r2
		double area = pi * (raio * raio);
		// area = pi*Math.pow(raio, 2);
		System.out.println("�rea " + area);

	}

}