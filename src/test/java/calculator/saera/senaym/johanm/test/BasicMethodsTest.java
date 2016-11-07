package calculator.saera.senaym.johanm.test;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import calculator.git.otherclasses.BasicMethods;

public class BasicMethodsTest {
	BasicMethods bm = new BasicMethods(); 
	Random rnd = new Random(); 
	public static final Logger LOG = Logger.getLogger(BasicMethods.class.getName()); 
	
	
	
	@Test
	public void testAddition() {
		double tempRandomValue = 0; 
		double tempResult = 0; 
		double tempRandomValue2 = 0; 
		
		for(int i = 0; i < 50; i++) {
			tempRandomValue = rnd.nextDouble()*100-20;  
			tempRandomValue = rnd.nextDouble()*100-20; 
			tempResult = tempRandomValue + tempRandomValue2;  
			LOG.info("Testing the method addition with: "+ tempRandomValue + tempRandomValue2);  
			assertEquals(bm.addition(tempRandomValue, tempRandomValue2), tempResult,0.0);    
		}
		
	}
	@Test
	public void testSubtraction() {
		double tempRandomValue = 0; 
		double tempResult = 0;
		double tempRandomValue2 = 0;  
		
		for(int i = 0; i < 50; i++) {
			tempRandomValue = rnd.nextDouble()*100-20;
			tempRandomValue2 = rnd.nextDouble()*100-20; 
			tempResult = tempRandomValue - tempRandomValue2 ;  
			LOG.info("Testing the method subtraction with: "+ tempRandomValue + tempRandomValue2); 
			assertEquals(bm.subtraction(tempRandomValue, tempRandomValue2), tempResult,0.0);  
		}
	} 
	@Test
	public void testDivision() {
		double tempRandomValue = 0; 
		double tempResult = 0; 
		double tempRandomValue2 = 0; 
		
		
		for (int i = 0; i < 50; i++) {
			tempRandomValue = rnd.nextDouble()*100-20; 
			tempRandomValue2 = rnd.nextDouble()*100-20; 
			tempResult = tempRandomValue / tempRandomValue2; 
			LOG.info("Testing the method with: "+ tempRandomValue + tempRandomValue2);
			assertEquals(bm.division(tempRandomValue, tempRandomValue2), tempResult, 0.0); 
		}
		
		LOG.info("Testing the method with: "+ tempRandomValue + 0);
		assertEquals(bm.division(tempRandomValue, 0), -1000.0, 0.0);
	}
	@Test
	public void testMultiplication() {
		double tempRandomValue = 0; 
		double tempResult = 0; 
		double tempRandomValue2 = 0; 
		
		for (int i = 0; i < 50; i++){
			tempRandomValue = rnd.nextDouble()*100-20;
			tempRandomValue2 = rnd.nextDouble()*100-20; 
			tempResult = tempRandomValue * tempRandomValue2; 
			LOG.info("Testing the method with: "+ tempRandomValue + tempRandomValue2);
			assertEquals(bm.multiplication(tempRandomValue, tempRandomValue2), tempResult, 0.0); 
		}
	}
 
}
