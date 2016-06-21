package com.junio.xti.java;

public class StringOperacao {

	public static void main(String[] args) {

		String s1 = "Write Once";
		String s2 = s1 + " Run AnyWhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {
			'J','a','v','a'	
		};
		String s4 = new  String(array);
		
		//OPERAÇÕES
		int tamanho = s1.length();
		char letra = s1.charAt(2);//0 a length()-1
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");//retorna a posiçao da palavra comeca
		int ultima = s3.lastIndexOf('a');//retorna a posição do ultimo a
		boolean vazia = s3.isEmpty();//retorna se a String está vazia
		//System.out.println(posicao);
		
		//COMPARAÇÃO
		String xti = "XTI";
		//boolean compara = xti.equals("XTI");//compara valores de Objeto
		//boolean compara = xti.equalsIgnoreCase("xti");//compara valores de Objeto mesmo se a letras estive em caixa alta ou caixa baixa
		//boolean compara = xti.startsWith("XT");//verifica se o texto comeca com este caractere
		boolean compara = xti.endsWith("XT");//verifica se o texto terminar com este caractere
		//xti == "xti"; compara se a referencia e igual 
		//System.out.println(compara);
		
		//int x ="amor".compareTo("bola");//-1
		//int x ="bola".compareTo("amor");//1
		int x ="amor".compareTo("amor");//0
		//System.out.println(x);
		
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(true, 6, "Olhe", 0, 4);//compara se a string esta em uma regiao dentro de outra String
		//System.out.println(o);
		
		
		//EXTRACAO E MODIFICACAO
		String l = "O Brasil é lindo";
		String sl = l.substring(11);// para peguar uma pedaco de uma String a partir de uma posicao
		sl = l.substring(2,8);// Pegar um derteminado pedaco de uma String, inicio e o fim de uma String
		sl = l.concat(" que maravilha");//concatena String
		//sl+= l;
		sl.replace('s','z');//troca ocorreça de um caractere
		sl.replaceFirst(" ", "x");//troca a primeira ocorreça de um caractere
		sl.toUpperCase();//colocar em caixa alta
		sl.toLowerCase();//colocar em caixa baixa
	
		System.out.println("  esp  aco  ".trim());//para remover espaco em branso do inicio e d fima
		
		
	}

}
