package com.junio.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
 
		/*01 de Jan de 1970*/
		System.out.println(System.currentTimeMillis() );
		
		Date agora = new Date();
		System.out.println(agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		/*Métodos*/
		data.getTime();//TEMPO ATUAL
		data.setTime(100_000_000_000L);//DEFINIR O TEMPO EM MILISENGUNDOS
		System.out.println(data.compareTo(agora));//-1,0,1  //COMPARA A DATA COM OUTRA DATA
		
		/* GregorianCalendar */
		Calendar c = Calendar.getInstance();
		c.set(1980,Calendar.FEBRUARY,12);
		System.out.println(c.getTime());
		
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//ano
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do mes
		
		c.set(Calendar.YEAR, 1972);//alterar o ano
		c.set(Calendar.MONTH, Calendar.MARCH);//alterar o MES
		c.set(Calendar.DAY_OF_MONTH, 25);//alterar o DIA
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);//zera os minutos
		c.clear(Calendar.SECOND);//zera os segundos
		System.out.println(c.getTime());
		 
		c.add(Calendar.DAY_OF_MONTH,1);//ADICIONAR MAIS 1
		c.add(Calendar.YEAR,1);//ADICIONAR MAIS 1
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH,-1);//diminuir  1
		c.add(Calendar.YEAR,-1);//diminuir 1
		System.out.println(c.getTime());
		
		
		c.roll(Calendar.DAY_OF_MONTH,10);//aumenta os dias sem alterar o mes 
		c.add(Calendar.DAY_OF_MONTH,30);//aumenta os dias e alterar para o proximo mes 
		c.roll(Calendar.DAY_OF_MONTH,10);//diminuir os dias sem alterar o mes 
		c.add(Calendar.DAY_OF_MONTH,30);//diminuir os dias e alterar para o proximo mes 
		System.out.println(c.getTime());
		
		/*Saudação com Bom dia, boa Tarde ou boa Noite*/
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if(hora < 12 ){
			System.out.println("Bom Dia");
		}
		else if(hora >= 12 && hora < 18){
			System.out.println("Bom Tarde");
		}
		else {
			System.out.println("Bom Noite");
		}
		
		
	}

}
