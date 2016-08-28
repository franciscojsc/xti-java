package com.junio.xti.colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {

		//FIFO
		Queue<String> fila = new LinkedList<>();
		fila.add("Francisco");
		fila.add("Ana");
		fila.add("José");
		
		System.out.println(fila);
		
		
		//observa o inicio da fila
		System.out.println(fila.peek());
		
		//remove o elemento do inicio da fila
		System.out.println(fila.poll());
		
		
		/*Outros métodos didponiveis em linkList*/
		LinkedList<String> f = (LinkedList<String>)fila;
		f.addFirst("Caio");//coloca no início da fila
		f.addLast("Vanessa");//coloca no início da fila
		System.out.println(f);
		
		
		f.peekFirst();//exibir primeiro elemeno da fila
		f.peekLast();//exibir ultimo elemeno da fila
	
		f.pollFirst();//remover primeiro elemeno da fila
		f.pollLast();//remover ultimo elemeno da fila
		
		
	}

}
