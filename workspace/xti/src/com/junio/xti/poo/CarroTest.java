package com.junio.xti.poo;

public class CarroTest {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundoZeroACem = 3.2;
		
		Carro Koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		System.out.println(Koenigsegg.modelo);
		
	}

}
