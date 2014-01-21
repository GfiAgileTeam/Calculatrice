package fr.gfi.agile;

import junit.framework.Assert;

import org.junit.Test;

import fr.gfi.agile.metier.ManagerOperations;

public class AdditionTest {

	@Test
	public void test(){
		double i =1;
		double j = 2;
		
		double resultat = ManagerOperations.additionner(i,j);
		
		Assert.assertEquals(i+j, resultat);
	}
	
}
