package com.junio.aulaXTI;

import java.util.ArrayList;

public class ListaArray {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		System.out.println(cores.toString());
		cores.add("Vermelho");
		System.out.println(cores.toString());
		cores.add(0,"Azul");
		System.out.println(cores.toString());
		
		System.out.println("Tamanho = "+ cores.size());
		System.out.println("Elemento2 = "+ cores.get(2));
		System.out.println("Inddice Branco = "+ cores.indexOf("Branco"));
		
		cores.remove("Branco");
		System.out.println(cores.toString());
		
		
		System.out.println("Tem Amarelo ? "+cores.contains("Amarelo"));
		System.out.println("Tem Azul ? "+cores.contains("Azul"));
	}

}
