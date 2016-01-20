package com.junio.xti.heranca;

public class AnimalTest {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")){
			System.out.println("Au, au!");
		}else if(animal.equals("Galinha")){
			System.out.println("Có, có!");
		}
	}

	public static void main(String[] args) {

		Animal generico = new Animal(0, null);
		Animal toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();

		Animal carijo = new Galinha();
		carijo.fazerBarulho();
		carijo.comida = "Milho";
		carijo.dormir();

		System.out.println(toto instanceof Cachorro);// Faz a analise se
														// pertence a Classe
		System.out.println(toto instanceof Animal);

		// Utilizando metodos da classe object

		toto.equals(carijo);// compara se os objeto sao iguais
		toto.hashCode();// utilizado em lista
		toto.getClass();// o tipo da classe desse objeto
		toto.toString();// exibir a classe na forma de String(texto)

		generico.fazerBarulho();
		toto.fazerBarulho();
		carijo.fazerBarulho();

		
		barulho(toto);//com polimorfissmo
		barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");// barulhoSemPolimorfismo
		barulhoSemPolimorfismo("Galinha");
	}

}
