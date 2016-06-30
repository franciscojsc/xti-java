package com.junio.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.junio.xti.poo.Conta;

public class Serializa2 {
	
	public void armazenarContas(ArrayList<Conta> contas) throws IOException {

		try(FileOutputStream fos = new FileOutputStream(
				"C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			}
		}
		
	}

	public ArrayList<Conta> recuperarContas() throws IOException, ClassNotFoundException {
		
		try(FileInputStream fis = new FileInputStream(
				"C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				return(ArrayList<Conta>)ois.readObject();
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Junio", 12000.25));
		contas.add(new Conta("Fernanda", 18526.50));
		contas.add(new Conta("Grabiela", 7800.33));
		contas.add(new Conta("Juliana", 78965.65));
		contas.add(new Conta("Nize", 100000.00));
		contas.add(new Conta("Ricardo", 20000.00));
		 
		Serializa2 operacao = new Serializa2();
		operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibirSaldo();
		}
			
	}

}
