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
	
	@Test
	public void testRoundNumber(){
		
	
		for(int i=0; i<50; i++){
			double number = rand.nextDouble()*100;
			double result = Math.round(number);
			
			LOG.info("Testing the method roundNumber with the value "+number);
			assertEquals("The result should be: "+ result,am.roundNumber(number),result,0.0);
		}
	}
	
	@Test
	public void testCountPow(){
		
		double firstNumber=0.0;
		double secondNumber=0.0;
		double result=0.0;
		
	
		for(int i=0; i<50; i++){
			firstNumber = rand.nextDouble()*100;
			secondNumber = rand.nextDouble()*100;
			result = Math.pow(firstNumber, secondNumber);
			
			LOG.info("Testing the method countPow with the value "+firstNumber+" and "+ secondNumber);
			assertEquals("The result should be: "+ result,am.countPow(firstNumber, secondNumber),result,0.0);
		}
	}
	
	@Test
	public void testCountAbsolute(){
		
		double number=0.0;
		double result=0.0;
	
		for(int i=0; i<50; i++){
			number = rand.nextDouble()*100;
			result = Math.abs(number);
			
			LOG.info("Testing the method countAbsolute with the value "+number);
			assertEquals("The result should be: "+ result,am.countAbsolute(number),result,0.0);
		}
	}
	
	@Test
	public void testCountSin(){
		
		double number=0.0;
		double result=0.0;
		
		for(int i=0; i<50; i++){
			number = rand.nextDouble()*100;
			result = Math.sin(number);
			
			LOG.info("Testing the method countSin with the value "+number);
			assertEquals("The result should be: "+ result,am.countSin(number),result,0.0);
		}
	}
	
	@Test
	public void testCountSquare(){
		
		double number=0.0;
		double result=0.0;
		
		for(int i=0; i<50; i++){
			number = rand.nextDouble()*100;
			result = Math.sqrt(number);
			
			LOG.info("Testing the method countSquare with the value "+number);
			assertEquals("The result should be: "+ result,am.countSquare(number),result,0.0);
		}
	}

}
