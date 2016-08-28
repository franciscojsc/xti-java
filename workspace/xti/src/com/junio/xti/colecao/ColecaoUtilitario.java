package com.junio.xti.colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {

		// Classe utilitaria para manipula��o de array (Arrays)
		// Classe utilitaria para manipula��o de todo tipo de Colec�o Java(Collections)

		List<String> list = new ArrayList<>();
		list.add("Guanar�");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("A�a�");
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
		Collections.addAll(list, "Cupua�u", "Laranja", "Laranja");
		System.out.println(list);

		// Verificar a frequencia que um elemento aparecer na lista
		System.out.println(Collections.frequency(list, "Laranja"));

		// Transforma um array em uma lista
		List<String> list2 = Arrays.asList("Acerola", "Graviola");

		// verifica se dentro da lista principal tem os elementos da lista secundaria
		boolean d = Collections.disjoint(list, list2);

		Collections.sort(list);
		
		//Pesquisa um elemento dentro da lista
		int indice = Collections.binarySearch(list,"Guanar�");
		System.out.println(indice);
		
		
		//Alterer todos os elementos para o valor
		Collections.fill(list, "A�a�");
		
		//cole��o n�o modific�vel
		Collection<String> constante = Collections.unmodifiableCollection(list);
		
	}

}
