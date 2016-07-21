package com.junio.xti.threads;

public class PonteSicronizada implements Ponte {

	private int valor = -1;
	private boolean ocupada = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupada){
			System.out.println("Ponte cheia. Produtor aguadar");
			wait();//faz a thread aguadar enquanto estiver ocupada
		}
		System.out.print("Produziu "+ valor);
		this.valor = valor;
		
		ocupada  = true;
		notifyAll();//serve para indicar para todas as threads que estao aguadando a modificaçao da ponte para continuar sua  execão 
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupada){
			System.out.println("Ponte vazia. Consumidora aguadando");
			wait();
		}
		System.err.print("Consumiu "+ valor);
		
		ocupada  = false;
		notifyAll();
		return valor;
	}

}
