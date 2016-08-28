package com.junio.xti.colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		//tipo da cahve //tipo do valor associado a chave
		Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "R�ssia");
		pais.put("IN", "�ndia");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		//Cont�m o elemento associado a chave
		System.out.println(pais.containsKey("BR"));
		
		//cont�m o elemento
		System.out.println(pais.containsValue("US"));
		
		//Recuperar o elemento da chave
		System.out.println(pais.get("CN"));
		
		//remover o elemento da chave
		pais.remove("RU");
		
		System.out.println(pais);
		
		Set<String> Keys = pais.keySet();
		for (String chave : Keys) {
			System.out.println(chave);
		}
	}

}
