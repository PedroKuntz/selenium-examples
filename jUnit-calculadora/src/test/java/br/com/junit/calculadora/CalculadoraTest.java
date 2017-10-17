package br.com.junit.calculadora;

import org.junit.Assert;
import org.junit.Test;

import br.com.junit.calculadora.Calculadora;


public class CalculadoraTest {

	@Test
	public void testSoma() {
		Calculadora calc = Calculadora.init(12.2).somar(3.8, 4.0);
		Assert.assertEquals(Double.valueOf(20.0), calc.resultado());
	}
}
