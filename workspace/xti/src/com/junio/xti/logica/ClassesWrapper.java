package com.junio.xti.logica;

public class ClassesWrapper {

	public static void main(String[] args) {

		Integer idade = new Integer(31);
		Double preco = new Double("12.32");// criando um classe que receber uma	 string
		double d = preco.doubleValue();// conventendo valor de uma string em double
		int i = preco.intValue();
		byte b = preco.byteValue();
		float f = preco.floatValue();
		Boolean casado = new Boolean("yes");
		
		//Conversão estática
		double d1 = Double.parseDouble("123.45");
		int i1  = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		Integer i2 = Integer.valueOf("101011", 2);
		
		System.out.println(idade + " \n" + d + "\n " + " " + i + "\n " + b+"\n "+i2);

	}

}
