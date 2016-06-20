package com.junio.xti.erros;

public class SenhaTest {
	static void autenticar(String senha) throws SenhaInvalidaException{
		if("12345".equals(senha)){
			//autenticado
			System.out.println("Autenticado");
		}else{
			//senha é incorreta
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}

	public static void main(String[] args) {

		try {
			autenticar("123");
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
