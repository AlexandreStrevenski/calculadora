package br.com.target;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	private Calculadora calculadora;
	
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
		System.out.println("executei");
	}
	
	@Test
	public void testSomaCorreta() {
		Integer resultado = calculadora.soma(5, 10);
		Integer resultadoEsperado = 15;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public void testSomaIncorreta() {
		Integer resultado = calculadora.soma(5, 10);
		Integer resultadoEsperado = 20;
		
		assertNotEquals(resultado, resultadoEsperado);
	}
	
	@Test
	public void testSomaNegativos() {
		Integer resultado = calculadora.soma(-5, -2);
		Integer resultadoEsperado = -7;
		
		assertEquals(resultado, resultadoEsperado);
	}
	
	@Test(expected=Exception.class)
	public void testSomaInvalida() {
		Integer resultado = calculadora.soma(4, null);
		Integer resultadoEsperado = 4;
		
		assertEquals(resultado, resultadoEsperado);
	}
		
}

