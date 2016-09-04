package com.junio.xti.poo;

public class Conta implements java.io.Serializable {

	static int x = 0;//n�o � serializado 
	private String cliente;
	transient private double saldo;//n�o � serializado
	
	public Conta() {
	}
	
	

	public Conta(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
	}



	
	public void exibirSaldo() {
		System.out.println(cliente + " seu saldo � " + saldo);
	}

	public String getCliente() {
		return cliente;
	}



	public double getSaldo() {
		return saldo;
	}



	void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	void transferePara(Conta destino, double valor){
		this.saca(valor);
		destino.deposita(valor);
	}
}
