package fr.gfi.agile;


import junit.framework.Assert;

import org.junit.Test;

import fr.gfi.agile.metier.ManagerOperations;

public class EqualsTest {


	@Test
	public void test(){
		
		double resultat = ManagerOperations.egal();
		
		Assert.assertEquals(0.0, resultat);
	}
	
	@Test
	public void testAddition(){
		
		double resultat = ManagerOperations.additionner();
		
		Assert.assertEquals(0.0, resultat);
	}
	
	@Test
	public void testSoustraction(){
		
		//double resultat = ManagerOperations.soustraire();
		double resultat = ManagerOperations.egal();
		
		Assert.assertEquals(0.0, resultat);
	}

	@Test
	public void testMultiplication(){
		
		//double resultat = ManagerOperations.multiplier();
		double resultat = ManagerOperations.egal();
		
		Assert.assertEquals(0.0, resultat);
	}
	
	@Test
	public void testDivision(){
		
		//double resultat = ManagerOperations.diviser();
		double resultat = ManagerOperations.egal();
		
		Assert.assertEquals(0.0, resultat);
	}
}