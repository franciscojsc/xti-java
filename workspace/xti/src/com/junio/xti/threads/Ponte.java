package com.junio.xti.threads;

/**
 * Uma <code>Ponte<code> representa o elo de 
 * ligação entre objetos Produtores e Consumidores
 * de informações. Os <i>Produtores<i> utillizam as
 * Pontes para gravar informações e compartilhar 
 * essas informações com os Consumidores que lêem
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
	 * será chamado pelas calsses Produtora de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	
	/**
	 * Recuperar a informação armazenada na Ponte. Esse 
	 * método será chamado pelas Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int  get() throws InterruptedException;
	
}
