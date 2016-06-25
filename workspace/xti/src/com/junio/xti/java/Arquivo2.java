package com.junio.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Users/Francisco/Documents/GitHub/xti/workspace/xti/files/texto.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		/* ESCRITA */
		BufferedWriter w = null;
		try {
			w = Files.newBufferedWriter(path, utf8);
			w.write("Outro Texto\n");
			w.write("Outro Texto\n");
			w.write(" Escrito");
			w.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (w != null) {
				w.close();
			}

		}

		// OUTRA FORMA A PARTIR DO JAVA7
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8);) {
			writer.write("MAIS Outro Texto\n");
			writer.write("Outro Texto\n");
			writer.write(" Escrito");
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* LEITURA */
		try (BufferedReader reader = Files.newBufferedReader(path, utf8);) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
