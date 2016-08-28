package com.junio.xti.colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {

		
		//A interface List aceita elementos duplicado
		List<String> list = new ArrayList<>();
		list.add("Futebol");
		list.add("Basquete");
		list.add("T�nis");
		list.add("Volei");
		list.add("Nata��o");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
		
		System.out.println(list);
		
		for (int i = 0; i <list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println(list);
		System.out.println(list.indexOf("BOXE"));//posi��o que se encontra o elemento
		System.out.println(list.subList(2,4));//EXIBIR UMA SUBLISTA DA POSI��O PASSADA
		list.subList(2, 4).clear();//remover uma subLista da Lista Principal
		System.out.println(list);
	}

}
