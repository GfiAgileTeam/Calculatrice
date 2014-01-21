package fr.gfi.agile;


import junit.framework.Assert;
import org.junit.Test;

public class EqualsTest {


	@Test
	public void test(){
		
		double resultat = Calculatrice.egal();
		
		Assert.assertEquals(0.0, resultat);
	}
	
}