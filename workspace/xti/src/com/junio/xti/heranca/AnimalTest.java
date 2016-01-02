package com.junio.xti.heranca;

public class AnimalTest {

	public static void main(String[] args) {

		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();

		Galinha carijo = new Galinha();
		carijo.fazerabarulho();
		carijo.comida = "Milho";
		carijo.dormir();
	}

}
