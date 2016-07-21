package com.junio.xti.threads;

public class PonteNaoSicronizada implements Ponte {

	private int valor = -1;
	
	@Override
	public void set(int valor) throws InterruptedException {
		System.out.print("Produziu "+ valor);
		this.valor = valor;
	}

	@Override
	public int get() throws InterruptedException {
		System.err.print("Consumiu "+ valor);
		return valor;
	}

}
