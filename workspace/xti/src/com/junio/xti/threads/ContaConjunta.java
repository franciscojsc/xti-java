package com.junio.xti.threads;

public class ContaConjunta {

	private int saldo = 100;

	public int getSaldo() {
		return saldo;
	}

	/*public void sacar(int valor, String cliente) {
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + "vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);// aguardando o processamento
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			saldo -= valor;
			String msg = cliente + " SACOU " + valor + "[Saldo Original= " + saldoOriginal + ", Saldo Final= " + saldo
					+ "]";

			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}

	}*/
	
	public synchronized void sacar(int valor, String cliente) {
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + "vai sacar");
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);// aguardando o processamento
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			saldo -= valor;
			String msg = cliente + " SACOU " + valor + "[Saldo Original= " + saldoOriginal + ", Saldo Final= " + saldo
					+ "]";
			
			System.out.println(msg);
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
		
	}
}
