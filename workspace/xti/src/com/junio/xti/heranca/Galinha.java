package com.junio.xti.heranca;

public class Galinha extends Animal implements AreaCalculavel {

	public Galinha() {
		super(2, "Milho");
		
	}
	
	void fazerBarulho(){
		System.out.println("C�, c�!");
	}

	@Override
	public double calculaArea() {
		return 0;
	}

}
