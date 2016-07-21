package com.junio.xti.threads;

public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {

		// Thread t = new Thread();

		new PingPong("ping", 1500).start();
		
		new PingPong("pong", 2500).start();
		
		System.out.println("Ver Thread");

	}

}
