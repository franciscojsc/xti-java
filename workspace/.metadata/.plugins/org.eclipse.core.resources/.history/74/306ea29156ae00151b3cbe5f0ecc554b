package com.junio.aulaXTI;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompra {

	public static void main(String[] args) {

		ArrayList<String> produtos = new ArrayList<String>();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Liste seus produtos : Para sair digite FIM");

		String produto;

		while (!"FIM".equals(produto = teclado.nextLine())) {
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
		
		System.out.println("\n");
		
		for (String prod : produtos) {
			System.out.println(prod);
		}
	}

}
