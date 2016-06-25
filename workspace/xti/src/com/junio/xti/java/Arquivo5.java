package com.junio.xti.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {

		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();//Listar os diretorio raiz
		for (Path path : dirs) {
			System.out.println(path);
		}

		/* LISTAR O CONTE�DO */
		Path dir = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {//listar o conteudo de um diretorio
			
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
		
		/*LISTAR PARTI��ES*/
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()){
			System.out.println("Unidade: "+ store.toString());
			System.out.println("Total: "+ store.getTotalSpace());
			System.out.println("Dispon�vel: "+ store.getUsableSpace());
			System.out.println("Utilizada: "+ (store.getTotalSpace()- store.getUsableSpace()));
			System.out.println();
		}

	}
	
	
		

}
