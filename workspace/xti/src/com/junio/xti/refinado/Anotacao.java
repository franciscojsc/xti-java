package com.junio.xti.refinado;

import java.io.Serializable;

/*
 * Institui��o :     Universidade XTI
 * Projeto:          Sistema de Avalia��o
 * Data de Cria��o:  31/08/2016
 * Criador:          Francisco Junio
 * Revis�o:          2
 */

@Cabecalho(institui��o = "Universidade XTI", projeto = "Sistema de Avalia��es", dataDeCriado = "31/08/2016", criador = "Francisco Junio", revisao = 2)
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
