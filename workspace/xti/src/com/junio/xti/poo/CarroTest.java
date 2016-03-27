package com.junio.xti.poo;

public class CarroTest {

	public static void main(String[] args) {

		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundoZeroACem = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 660;
		ferrari.motor = v12;// adicionar o motor ao carro

		Carro Koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("v8", 101);
		Koenigsegg.motor = v8;

		System.out.println(Koenigsegg.motor.potencia);
		System.out.println(Koenigsegg.modelo);

		Carro bugatti = new Carro("Bugatti", 430, 2.2, new Motor("w16", 1200));
		System.out.println(bugatti.motor.potencia);

	}

}
