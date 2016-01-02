package com.junio.xti.poo;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	double segundoZeroACem;
	Motor motor;

	public Carro() {

	}

	public Carro(String modelo, int velocidadeMaxima, double segundoZeroACem) {
		this(modelo, velocidadeMaxima, segundoZeroACem, null);
	}

	public Carro(String modelo, int velocidadeMaxima, double segundoZeroACem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundoZeroACem = segundoZeroACem;
		this.motor = motor;
	}

}
