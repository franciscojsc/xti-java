package com.junio.xti.logica;

public class AutoBoxing {

	public static void main(String[] args) {

		Integer x = new Integer(555);//empacotado
		int a = x.intValue();//desepacotado
		a++;//incrementa
		x = new Integer(a);//re-empacotar
		System.out.println(x.intValue());
		
		Integer i  = 555;
		i++;//desempacota, incrementa, reepacota
		System.out.println(i);
		
		//i.intValue();
		
		Boolean v = new Boolean("true");
		if(v.booleanValue()){
		System.out.println(v);	
		}
		
		if(v){
			System.out.println(v);
		}
	}

}
