package fr.gfi.agile;

import junit.framework.Assert;

import org.junit.Test;

import fr.gfi.agile.metier.ManagerOperations;

public class MultiplicationTest {

	@Test
	public void test() {
		double i = 1;
		double j = 2;

		double resultat = ManagerOperations.multiplier(i, j);

		Assert.assertEquals(i * j, resultat);
	}
}
