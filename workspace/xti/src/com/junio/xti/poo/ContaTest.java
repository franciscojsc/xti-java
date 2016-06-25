package com.junio.xti.poo;

public class ContaTest {
	public static void main(String[] args) {

		Conta conta = new Conta("Francisco",10_000.00);
		

		conta.exibirSaldo();
		conta.saca(1000);
		conta.exibirSaldo();
		conta.deposita(200);
		conta.exibirSaldo();
		
		System.out.println("\n");
		
		Conta destino = new Conta("Alex",8_000.00);
		
		
		destino.exibirSaldo();
		
		conta.transferePara(destino, 1500);
		conta.exibirSaldo();
		destino.exibirSaldo();
	}
}
