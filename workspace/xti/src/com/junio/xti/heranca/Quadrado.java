package com.junio.xti.heranca;

public class Quadrado implements AreaCalculavel {

	double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
