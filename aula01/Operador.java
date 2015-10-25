package com.junio.aulaXTI;

public class Operador {

	public static void main(String[] args) {

		// 2 + 3 operador bin�rio
		// -2 operador un�rio
		// true ? "sim":"n�o" oprador tern�rio

		int x = 9 + 4;
		System.out.println(x);

		String t = "9";
		t = t + "4";
		System.out.println(t);

		double i = (7 - 8 + 20) * 5;
		System.out.println(i);

		String y = "oi " + "Programador Java";
		System.out.println(y);

		double mod = 4 % 2;
		System.out.println(mod);

		int z = 6;
		z++;// p�s-incremento
		System.out.println(z);
		++z;// pr�-incremento
		System.out.println(z);

		z--;// p�s-decremento
		System.out.println(z);
		--z;// pr�-decremento
		System.out.println(z);

		
	}

}
