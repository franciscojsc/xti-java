package com.junio.xti.refinado;

import java.io.Serializable;

/*
 * Instituição :     Universidade XTI
 * Projeto:          Sistema de Avaliação
 * Data de Criação:  31/08/2016
 * Criador:          Francisco Junio
 * Revisão:          2
 */

@Cabecalho(instituição = "Universidade XTI", projeto = "Sistema de Avaliações", dataDeCriado = "31/08/2016", criador = "Francisco Junio", revisao = 2)
@ErrosCorrigidos(erros = {"0001","0002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable {

	@SuppressWarnings("unused")
	private int x;


	@Deprecated
	public void anotar(){
		
	}
	
	
	@Override
	public String toString(){
		return null;
	}
	
}
