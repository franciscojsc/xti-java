package com.junio.xti.poo;

public class Conta {

	String cliente;
	double saldo;

	void exibirSaldo() {
		System.out.println(cliente + " seu saldo é " + saldo);
	}

	void saca(double valor) {
		saldo -= valor;
	}

	void deposita(double valor) {
		saldo += valor;
	}
	
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
}
