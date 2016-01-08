package com.junio.xti.heranca;

public class AnimalTest {

	public static void main(String[] args) {

		Animal toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir(); 

		Animal carijo = new Galinha();
		carijo.fazerabarulho();
		carijo.comida = "Milho";
		carijo.dormir();
		
		System.out.println(toto instanceof Cachorro);//Faz a analise se pertence a Classe
		System.out.println(toto instanceof Animal);
		
		
		//Utilizando metodos da classe object
		
		toto.equals(carijo);//compara se os objeto sao iguais
		toto.hashCode();//utilizado em lista
		toto.getClass();//o tipo da classe desse objeto
		toto.toString();//exibir a classe na forma de String(texto)
		
	
		
	}

}
