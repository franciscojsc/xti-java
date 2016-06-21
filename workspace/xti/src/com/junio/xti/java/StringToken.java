package com.junio.xti.java;

public class StringToken {

	public static void main(String[] args) {

		String s = "XHTML; CSS; Javascript; JQuery; Java";
		s = "Venha trabalhar na XTI";
		String[] tokens = s.split(" ");//o delimitador pode ser qualque caracter ou palavra
		System.out.println(tokens.length);
		
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			System.out.println(token);
		}
		
	}

}
