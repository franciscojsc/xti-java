package com.junio.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.junio.xti.poo.Conta;

public class Arquivo3 {
	private Path path = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;

	public void armazenarContas(ArrayList<Conta> contas) throws IOException {

		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			for (int i = 0; i < contas.size(); i++) {
				Conta conta = contas.get(i);
				writer.write(conta.getCliente() + ";" + conta.getSaldo()+"\n");
			}
		}
	}

	public ArrayList<Conta> recuperarContas() throws IOException {
		ArrayList<Conta> contas = new ArrayList<>();
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] t = line.split(";");
				Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
				contas.add(conta);
			}
		}
		return contas;
	}

	public static void main(String[] args) throws IOException {
		/*ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Junio", 12000.25));
		contas.add(new Conta("Fernanda", 18526.50));
		contas.add(new Conta("Grabiela", 7800.33));
		contas.add(new Conta("Juliana", 78965.65));
		contas.add(new Conta("Nize", 100000.00));
		contas.add(new Conta("Ricardo", 20000.00));
		 */
		Arquivo3 operacao = new Arquivo3();
		//operacao.armazenarContas(contas);
		ArrayList<Conta> contas2 = operacao.recuperarContas();
		for (Conta conta : contas2) {
			conta.exibirSaldo();
		}
			
	}

}
