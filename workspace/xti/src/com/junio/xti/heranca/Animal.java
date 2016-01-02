package com.junio.xti.heranca;

public class Animal {
	
	private int serial;//Nao sera visto pela subclasse
	protected int serial1;//Somente sera visto pela subclasse
	double peso;
	String comida;
	
	public Animal(){
		
	}

	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("Dormiu");
	}

	void fazerabarulho() {
		System.out.println("Fazer Barulho");
	}

}
