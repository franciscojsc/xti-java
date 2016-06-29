package com.junio.xti.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.junio.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		//String[] nomes = { "Ricardo", "Junio", "Sandra" };
		Conta conta1 = new Conta("Junio",12.6556);
		Conta conta2 = new Conta("Marcio",1.476);

		/* ESCRITA DE OBJETO */
		FileOutputStream fos = new FileOutputStream(
				"C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//oos.writeObject(nomes);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();

		/* LEITURA DE OBJETO */
		FileInputStream fis = new FileInputStream(
				"C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//String[] nomes1 = (String[]) ois.readObject();
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		
		//System.out.println(Arrays.toString(nomes1));
		c1.exibirSaldo();
		c2.exibirSaldo();
		
	}

}
