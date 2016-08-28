package com.junio.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {

		// Classe utilitaria para manipulação de array (Arrays)
		// Classe utilitaria para manipulação de todo tipo de Colecão Java(Collections)

		List<String> list = new ArrayList<>();
		list.add("Guanará");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açaí");
		list.add("Banana");

		System.out.println(list);

		// ordenar a lista
		Collections.sort(list);
		System.out.println(list);

		// inverte a lista
		Collections.reverse(list);
		System.out.println(list);

		// embaralha a lista
		Collections.shuffle(list);
		System.out.println(list);

		// adiciona mais elementos a lista
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja");
		System.out.println(list);

		// Verificar a frequencia que um elemento aparecer na lista
		System.out.println(Collections.frequency(list, "Laranja"));

		// Transforma um array em uma lista
		List<String> list2 = Arrays.asList("Acerola", "Graviola");

		// verifica se dentro da lista principal tem os elementos da lista secundaria
		boolean d = Collections.disjoint(list, list2);

		Collections.sort(list);
		
		//Pesquisa um elemento dentro da lista
		int indice = Collections.binarySearch(list,"Guanará");
		System.out.println(indice);
		
		
		//Alterer todos os elementos para o valor
		Collections.fill(list, "Açaí");
		
		//coleção não modificável
		Collection<String> constante = Collections.unmodifiableCollection(list);
		
	}

}
