package com.junio.xti.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.junio.xti.poo.Matematica;

import static junit.framework.Assert.*;

public class MatematicaTest {

	Matematica m;
	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMaior() {
		assertEquals(20, m.maior(10,20));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testRaiz() {
		assertEquals(4, m.raiz(16));
	}

}
