package com.junio.xti.poo;

public class FuncionarioPacote {

	public static void main(String[] args) {

		/*
		 * set -------- colocar valor
		 * get is ----- exibir alor
		 * 
		 */
		Funcionario f = new Funcionario();
		f.setNome("junio");
		f.setAtivo(true);
		f.setSalario(20_000.00);
		f.setSenha("fr12");
		
		
		System.out.println(f.getNome()+" "+f.getSalario()+" "+f.isAtivo()+" "+ f.getSenha());
																				
	
		
	}
}
