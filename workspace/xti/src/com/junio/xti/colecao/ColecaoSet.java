package com.junio.xti.colecao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {

		String []cores = {
				"Verde","Azul","Amarelo","Branco","Azul"
		};
		
		//aceita elementos duplicados
		List<String> list = Arrays.asList(cores); 
		System.out.println(list);
		
		//não aceita elementos duplicados
		Set<String> set =new  HashSet<String>(list);
		System.out.println(set);
	}

}
