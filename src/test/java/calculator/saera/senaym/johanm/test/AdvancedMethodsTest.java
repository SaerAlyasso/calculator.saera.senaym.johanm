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
	public void testFibonachi() {

		int firstNumber = 0;
		
		double result =0.0;
		for (int i = 0; i < 50; i++) {
			firstNumber = rand.nextInt(10)+1;
			
			result = am.fibonacci(firstNumber);
			LOG.info("Testing fibonachi with random int " + firstNumber);
			assertEquals("The result should be: "+ result,  am.fibonacci(firstNumber),result,0.1111);
		}
		
		
	}

}
