package fr.gfi.agile;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import fr.gfi.agile.business.CalculatorBusiness;

public class SoustraireTest extends TestCase{
	
	private CalculatorBusiness calc;
	
	@Before
	public void setUp() {
		calc = new CalculatorBusiness();
	}
	
	@Test
	public void testPositif() {
		assertEquals(3.0, calc.soustraire(5, 2));
	}
	
	@Test
	public void testNegatif() {
		assertEquals(-3.0, calc.soustraire(2, 5));
	}
	
	@Test
	public void testVirgulePositif() {
		assertEquals(3.5, calc.soustraire(5.5, 2));
	}
	
	@Test
	public void testVirguleNegatif() {
		assertEquals(-3.5, calc.soustraire(2, 5.5));
	}
	
	
}
