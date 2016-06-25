package com.junio.xti.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Aquivo4 {

	public static void main(String[] args) throws IOException {

		/*Path path = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/texto.txt");
		System.out.println(Files.exists(path));//se existir
		System.out.println(Files.isDirectory(path));//se é diretorio
		System.out.println(Files.isRegularFile(path));//se é uma arquivo conhecido como (imagem,texto e etc)
		System.out.println(Files.isReadable(path));//se pode ser lido
		System.out.println(Files.isExecutable(path));//se é executavel
		System.out.println(Files.size(path));//tamanho do arquivo
		System.out.println(Files.getLastModifiedTime(path));//ultima vez que fopi modificado
		System.out.println(Files.getOwner(path));//o usuario do computador
		System.out.println(Files.probeContentType(path));//o tipo de arquivo
		*/

		/*DELETE*/
		//Files.delete(path);
		//Files.deleteIfExists(path);
		
		/*CREATE*/
		Path path1 = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/fonte.txt");
		Files.deleteIfExists(path1);//deleta se existir
		Files.createFile(path1);//criar o arquivo
		Files.write(path1,"Meu texto, meu texto".getBytes());//escreve no arquivo
		
		/*COPY*/
		Path copia = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/copia.txt");
		Files.copy(path1,copia, StandardCopyOption.REPLACE_EXISTING);
		
		/*MOVE*/
		Path mover = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path1, mover, StandardCopyOption.REPLACE_EXISTING);
		
		
	}

}
