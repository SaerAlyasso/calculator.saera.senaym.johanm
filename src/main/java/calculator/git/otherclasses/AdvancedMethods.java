package calculator.git.otherclasses;

import calculator.git.interfaces.AdvancedOperations;

/**
 * This class implements AdvancedOperations interface.
 * 
 * @author Saer, Senay, Johan
 * @version 1.0
 * @since 2016-11-02
 *
 */
public class AdvancedMethods implements AdvancedOperations{

	/**
	 * This method counts the fibonacci number
	 * @param number takes a double number as parameter
	 * @return fib
	 */
	public int fibonacci(int number) {
		int fib=0;
		if (number==0) 	return 0;
		if (number<=2) return 1;
		fib=fibonacci(number-1)+fibonacci(number-2);
		return fib;
	}

	/**
	 * This method counts the power of the given exponent
	 * to the given base
	 * @param base takes base as first parameter
	 * @param exponent takes exponent as second parameter
	 * @return Math.pow(base, exponent);
	 */
	public double countPow(double base, double exponent) {
		
		return Math.pow(base, exponent);
		
	}
	
	/**
	 * This method counts the absolute value of a double
	 * @param number takes number as a parameter
	 * @return Math.abs(number);
	 */
	public double countAbsolute(double number) {
		
		return Math.abs(number);
	}
	
	/**
	 * This method counts the percent of the given number
	 * @param number takes number as a parameter
	 * @return Math.sin(number);
	 */

	public double countSin(double number) {
 

		return Math.sin(number);

	}


	/**
	 * @param number takes a number as parameter
	 * @return Math.sqrt(number);
	 */
	public double countSquare(double number) {
		
		return Math.sqrt(number);
	}

	/**
	 * This method round the given number to the
	 * nearest double value
	 * @param number takes number as a parameter
	 * @return Math.round(number);
	 */
	public double roundNumber(double number) {
		
		return Math.round(number);
	}

	

	

}
