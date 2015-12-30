package com.junio.xti.logica;

public class Variaveis {

	public static void main(String[] args) {

		String nome = "Junio";
		String segundoNome, treceiroNome;
		int idade = 22;
		boolean casado = false;

		System.out.println(nome);

		int idade01 = 31;
		long l = 9000000000000000000l;
		double preco = 12.25;
		char sexo = 'M';// UNICODE

		byte b = 127;
		short s = 32767;
		int i = 2000000000;
		double d = 1.7976931348623157E+308;// IEEE 754
		float f = 123f;

		i = s;// cast implicito
		System.out.println(s);
		System.out.println(i);

		i = (int) l;// cast explicito
		System.out.println(l);
		System.out.println(i);

	}

}
