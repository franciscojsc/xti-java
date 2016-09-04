package com.junio.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(5000);
		while (true) {
			Socket socket = server.accept();// aguarda a solicitação do cliente
			try (PrintWriter writer = new PrintWriter(socket.getOutputStream())) {
				writer.println("Aprendar Java e seja feliz");
			}
		}
	}

}
