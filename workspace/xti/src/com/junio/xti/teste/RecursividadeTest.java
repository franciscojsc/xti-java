package com.junio.xti.teste;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.junio.xti.refinado.Recursividade;

public class RecursividadeTest {


	@Test
	public void testSoma() {
		assertEquals(55, Recursividade.soma(10));
	}

	@Test
	public void testPotencia() {
		assertEquals(81,Recursividade.potencia(3, 4));
	}

}
