package com.junio.xti.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {

		String padrao ="Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		//System.out.println(b);
		
		b = "Java".matches("java");
		//System.out.println(b);
		
		/*   MODIFICADORES
		 (?i), Ignora maiúscula e minúscula
		 (?x), Comentários
		 (?m), Multilinhas
		 (?s), Dottal   */
		
		b = "Java".matches("(?im)java");
		//System.out.println(b);
		
		/*METACARACTERES
		. qualquer caracter
		\d dígito          [0-9]  
		\D não é dígito    [^0-9]
		\s espaços         [ \t\n\x0B\f\r]
		\S não é espaço    [^\s]
		\w letra           [a-zA-Z_0-9]
		\W não é letra  */
		
		b = "@".matches(".");
		b = "2".matches("\\d");
		b = "a".matches("\\w");
		b = " ".matches("\\s");
		
		b = "Pi".matches("..");
		b = "Pie".matches("...");
		b = "21".matches("\\d\\d");
		
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "49360-000".matches(cep);
		//System.out.println(b);
		
		
		/*QUANTIFICADORES
		X{n}         X, exatamente n vezes
		X{n,}        X, pelo menos n vezes
		X{n,m}       X, pelo menos n mas não mais do que m vezes
		X?           X, 0 ou 1 vez
		X*           X, 0 ou + vez
		X+           X, 1 ou + vez  */
		
		b = "21".matches("\\d{2}");
		b = "123".matches("\\d{2,}");
		b = "1243".matches("\\d{2,4}");
		
		b = "".matches(".?");//0-1
		b = "ab".matches(".*");//0 ou + vezes
		b = "ab".matches(".+");//1 ou + vezes
		
		b = "70294-070".matches("\\d{5}-\\d{3}");
		b = "20/11/1992".matches("\\d{2}/\\d{2}/\\d{4}");	
		
		
		/*METACARACTER DE FONTEIRA
		^ inicia
		$ finaliza
		| ou                       */
		
		b = "Pier21".matches("^Pier.*");
		b = "Pier21".matches(".*21$");
		b = "tem java aqui".matches(".*java.*");
		b = "tem java aqui".matches("^tem.*aqui$");
		b = "sim".matches("sim|não");
		
		/*AGRUPADORES
		 [...]          Agrupamento
		 [a-z]          Alcance
		 [a-e][i-u]     União
		 [a-z&&[aeiou]] Interseção
		 [^abc]         Exceção
		 [a-z&&[^m-p]]  Subtração
		 \x             Fuga literal    */
		
		b = "a".matches("[a-z]");
		b = "3".matches("[0-9]");
		
		b = "true".matches("[tT]rue");//true True
		b = "Yes".matches("[tT]rue|[yY]es");//true True yes Yes
		b = "Junio".matches("[A-Z][a-zA-Z]*");//Primeiro Nome
		b = "olho".matches("[^abc]lho");
		b = "crau".matches("cr[ae]u");//crau creu
		
		b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");//validação de email
		//System.out.println(b);
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()){
			//System.out.println(matcher.group());
		}
		
		/*SUBSTITUIÇÃO */
		String r = doce.replaceAll("(?i)doce", "Docinho");
		
		String rato ="O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		
		String url = "www.xti.com.br/clientes-2011.html";
				    //http://www.xti.com.br/2011/clientes.jsp//Objetivo
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		
		re = ("(www.xti.com.br)/(\\w{2,})-(\\d{4}).html");
		
		r = url.replaceAll(re,"http://$1/$3/$2.jsp");
		System.out.println(r);
		System.out.println(url);
	}

}
