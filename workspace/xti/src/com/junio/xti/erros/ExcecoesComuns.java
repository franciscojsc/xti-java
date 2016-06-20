package com.junio.xti.erros;

import com.junio.xti.heranca.Animal;
import com.junio.xti.heranca.Cachorro;
import com.junio.xti.heranca.Galinha;

public class ExcecoesComuns {

	static int []arraNull;
	static int []array = new int [0];
	
	public static void main(String[] args) {
		//NullPointerException
		System.out.println(arraNull.length);//esta tentando acessa um objeto nulo
		
		//ArithmeticException
		int x = 5/0;// tenta dividir um numero por zero
		
		//ArrayIndexOutOfBoundsException
		System.out.println(array[1]);//tentar acessar uma posicao que não existe no array
		
		
		Animal a = new Galinha();//É filha de animal
		Galinha g = (Galinha)a;// A galinha É um animal
		//ClassCastException
		Cachorro c = (Cachorro)a;//Não passa no teste É um
		
		//NumberFormatException
		int inteiro = Integer.parseInt("x");// tentar converte uma String que não é numero
		
		
	}

}
