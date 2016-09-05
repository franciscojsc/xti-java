package com.junio.xti.redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	Scanner leitor;
	
	
	List<PrintWriter > escritores = new ArrayList<>();
	
	public ChatServer() {
		ServerSocket server;
		try {
			server = new ServerSocket(5000);
			while (true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				escritores.add(p);
			}

			// leitor = new Scanner (s.getInputStream());
			// System.out.println("Recebeu: "+ leitor.nextLine());

		} catch (IOException e) {
		}
	}

	private void encaminharParaTodos(String texto){
		for (PrintWriter printWriter : escritores) {
			try{
				printWriter.println(texto);
			printWriter.flush();
			}catch(Exception e){
				
			}
			
		}
	}
	
	private class EscutaCliente implements Runnable {

		Scanner leitor;

		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (Exception e) {

			}

		}

		@Override
		public void run() {
			try {
				String texto;
				while ((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
					encaminharParaTodos(texto);;
				}
			} catch (Exception e) {

			}

		}
	}

	public static void main(String[] args) {
		new ChatServer();
	}

}
