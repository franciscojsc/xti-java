package com.junio.xti.java;

public class StringMutavel {

	public static void main(String[] args) {

		StringBuffer s0 = new StringBuffer();// mais utilizado com threads
		StringBuilder s1 = new StringBuilder("Java");

		s1.toString();
		s1.length();// tamanho
		s1.capacity();// capacidade

		System.out.println(s1);
		s1.reverse();// inverte os caracteres

		s1.append(" Trabalhando ");
		char[] c = { 'c', 'o', 'm' };
		s1.append(c).append(" Textos.");
		System.out.println(s1);

		String s = "Oi" + " como " + "vai voçê?";
		String sb = new StringBuilder("Oi").append(" como ").append(" vai voçê?").toString();
		
		String url = new StringBuilder("WWW.XTI.COM.BR").delete(0,4).toString();
		System.out.println(url);
	}

}
