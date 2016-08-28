package com.junio.xti.colecao;

import java.util.ArrayList;

public class Generico<E> {

	E elemento;
	
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	//Utlizando o coringa em genericos (extends) ou (super)
	public double soma(ArrayList< ? extends Number>lista){//qualquer tipo que extenda Number ou Number
		double total =0;
		
		for(Number number: lista){
			total+= number.doubleValue();
		}
		return total;
	}
	

	public static void main(String[] args) {

		Generico<String> g = new Generico<>();
		
		g.setElemento("Lago Paranóa");
		//g.setElemento(123456);
		String e = (String)g.getElemento();
		e.toUpperCase();
		
		
	}

}
