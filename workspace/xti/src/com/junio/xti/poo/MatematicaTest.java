package com.junio.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		int ma = m.maior(10, 200);
		System.out.println(ma);

		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);

		double so = m.somar(10, 20, 147, 222, 444);
		System.out.println(so);

		String p = m.pares(4, 5, 8);
		System.out.println(" Numeros pares : " + p);

		String i = m.impar(4, 5, 8);
		System.out.println(" Numeros impares : " + i);

		int calcularRaiz = m.raiz(27);
		System.out.println(calcularRaiz);

		System.out.println(Math.sqrt(27));

		// sobrecarregando metodos
		System.out.println(m.media(5));
		System.out.println(m.media(5, 3));
		System.out.println(m.media(5, 3, 1, 5, 8, 9, 6, 3, 7));
		System.out.println(m.media("5", "3"));
	}

}
