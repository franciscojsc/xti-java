package com.junio.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {

		double saldo =123_456.789;
		NumberFormat f = NumberFormat.getInstance();//genericos
		System.out.println(f.format(saldo));
		
	    f = NumberFormat.getIntegerInstance();//inteiros
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance();//percentuais
		System.out.println(f.format(0.25));
		
		f = NumberFormat.getCurrencyInstance();//moedas
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(1);//numeros de casas decimais
		System.out.println(f.format(saldo));
		
		/*	Internacionalização */
		f = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(f.format(saldo));
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(f.format(saldo));
		
		/*CONVERSAO DE VALORES*/
		f = NumberFormat.getCurrencyInstance();
		System.out.println(f.parse("R$ 1.100,25"));
		
	}

}
