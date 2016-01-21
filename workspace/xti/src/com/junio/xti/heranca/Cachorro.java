package com.junio.xti.heranca;

public class Cachorro extends Animal {

	public Cachorro() {
		super(30, "Carne");
	}

	final void fazerBarulho() {
		System.out.println("Au, au!");
	}
}
