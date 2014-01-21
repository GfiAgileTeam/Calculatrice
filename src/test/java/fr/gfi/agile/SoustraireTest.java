package fr.gfi.agile;

import junit.framework.TestCase;

import org.junit.Test;

public class SoustraireTest extends TestCase{
	
	@Test
	public void testSuccess() {
		assertEquals(3.0, Calculatrice.soustraire(5, 2));
	}
	
}
