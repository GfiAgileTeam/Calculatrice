package fr.gfi.agile;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import fr.gfi.agile.metier.ManagerOperations;

public class AdditionTest extends TestCase {

	private ManagerOperations calc;

	@Before
	public void setUp() {
		calc = new ManagerOperations();
	}

	@Test
	public void test() {
		double i = 1;
		double j = 2;

		double resultat = calc.additionner(i, j);

		assertEquals(i + j, resultat);
	}

}
