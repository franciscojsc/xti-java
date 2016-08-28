package com.junio.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();
		c.add("A");
		c.add("E");
		c.add("I");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("A"));
		
		c.remove("A");
		System.out.println(c.toString());
		
		/* GRUPOS*/
		Collection<String> c2 = Arrays.asList("O","U");
		c.addAll(c2);
		System.out.println(c);
		System.out.println(c.containsAll(c2));//verificar se existe todos esses elementos
		c.removeAll(c2);//remove todo elemento da coleção passada como argumentos
		System.out.println(c.toString());
		
		/*Percorre os elemnetos*/
		for (String valor: c) {
			System.out.println(valor);
		}
		
		String[]s = c.toArray(new String[c.size()]);//convertem um collection em array
		System.out.println(Arrays.toString(s));		
		
		c.clear();//limpa toda a coleção
		
	}

}
