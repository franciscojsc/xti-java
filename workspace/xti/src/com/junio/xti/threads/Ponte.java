package com.junio.xti.threads;

/**
 * Uma <code>Ponte<code> representa o elo de 
 * liga��o entre objetos Produtores e Consumidores
 * de informa��es. Os <i>Produtores<i> utillizam as
 * Pontes para gravar informa��es e compartilhar 
 * essas informa��es com os Consumidores que l�em
 * esses dados da Ponte para fazer o procesamento.
 * 
 * 
 * @author Francisco Junio
 * @Ricardo Lopes Costa
 * @version 1.3
 * @since 1.0
 * 
 * @see PonteNaoSincronizada
 * @see PonteSicronizada
 *
 */
public interface Ponte {

	/**
	 * 	Armazenar o valor informado na ponte. Geralmente
	 * ser� chamado pelas calsses Produtora de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	/**
	 * Recuperar a informa��o armazenada na Ponte. Esse 
	 * m�todo ser� chamado pelas Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int  get() throws InterruptedException;
	
}
