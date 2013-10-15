package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		//fail("Not yet implemented");
		assertEquals(4,Calculadora.somar(2, 2));
		assertEquals("Luciano Martins",Calculadora.somar("Luciano ", "Martins"));
	}
}
