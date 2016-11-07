package calculator.saera.senaym.johanm.test;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import calculator.git.otherclasses.AdvancedMethods;

public class AdvancedMethodsTest {

	AdvancedMethods am = new AdvancedMethods();
	Random rand = new Random();
	
	public static final Logger LOG = Logger.getLogger(AdvancedMethods.class.getName());
	
	@Test
	public void testRoundNumber() {
		
		
		
		for(int i=0; i<50; i++){
			double number = rand.nextDouble()*100;
			double result = Math.round(number);
			
			LOG.info("Testing the method roundNumber with the value "+number);
			assertEquals("The result should be: "+ result,am.roundNumber(number),result,0.0);
		}
		
	}

}
