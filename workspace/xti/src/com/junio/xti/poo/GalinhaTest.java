package com.junio.xti.poo;

public class GalinhaTest {

	public static void main(String[] args) {
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();// Dica
		g1.botar();
		g1.botar();
		g1.botar();

		System.out.println(g1.ovos);

		Galinha g2 = new Galinha();
		g2.botar().botar();

		System.out.println(g2.ovos);

		System.out.println(Galinha.ovosDaGranja);// TOTAL DE OVOS DE TODAS GALINHA
													 
		System.out.println(Galinha.mediaDeOvos(2));
	}

}
