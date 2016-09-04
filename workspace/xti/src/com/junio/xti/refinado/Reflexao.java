package com.junio.xti.refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		String nome  = "com.junio.xti.poo.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());//Nome simplificado da classe
		
		Field [] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		
		//todos os metodos na classe
		Method[] m =classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		//todos os construtor da classe
		Constructor[]c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		//Criando uma instancia da classe
		@SuppressWarnings("unused")
		Object o = classe.newInstance();
		@SuppressWarnings({ "unused", "unchecked" })
		Method md = classe.getMethod("deposita", double.class);
		Method me = classe.getMethod("exibirSaldo");
		md.invoke(o, 120);//invoncando um método
		me.invoke(o);
		
		
		//recuperando um contrustor com paramentos
		Constructor co = classe.getConstructor(String.class, double.class);
		Object obj = co.newInstance("Francisco",123_456.789);
		me.invoke(obj);
		
		
	}

}
