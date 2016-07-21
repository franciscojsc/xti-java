package com.junio.xti.threads;

public class PonteTest {

	public static void main(String[] args) {

		/*Ponte ponte = new PonteNaoSicronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();*/
		
		
		Ponte ponte = new PonteSicronizada();
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
	}

}
