package fr.gfi.agile;

import junit.framework.TestCase;

import org.junit.Assert;
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
	public void test(){
		ManagerOperations.setDONNEE_PRECEDENTE(1.0);
		ManagerOperations.setDONNEE_AFFICHEE(2.0);
		
		double resultat = ManagerOperations.additionner();
		
		Assert.assertEquals(3.0, resultat);
	}

}