package com.junio.xti.java;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	public static void main(String[] args) throws IOException {

		Properties p  = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		p.setProperty("xti.curso.java.version", "1.0.0");
	
		/*
		 * Listar as propiedades do Sistema
		 * 
		 * Set<Object> pk = p.keySet();
		 * for (Object key : pk) {
		 * 
		 *    System.out.println(key+" = "+ p.get(key));
		 *    
		 *                       }
		*/
		
		/*
		 * Capturar usuario e senha atraves do CMD
		 * 
		Console c = System.console();
		System.out.println("Usuario: ");
		String user = c.readLine();
		System.out.println("Senha: ");
		char[] pass = c.readPassword();
		System.out.println("Usuario = "+user+" Senha = "+new String(pass));
		*/
		
		//para executar algum program na mesma forma que abre no CMD
		Runtime.getRuntime().exec("notepad");//receber o nome do programa
	}

}
