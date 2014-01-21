package fr.gfi.agile;

import junit.framework.Assert;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void test(){
		double i =1;
		double j = 2;
		
		double resultat = Calculatrice.additionner(i,j);
		
		Assert.assertEquals(i+j, resultat);
	}
	
}
