package calculator.git.otherclasses;

import calculator.git.interfaces.BasicOperations;

/**
 * This class implements BasicOperations
 * 
 * @author Saer, Senay
 * @version 1.0
 * @since 2016-11-02
 *
 */

public class BasicMethods implements BasicOperations{

	/**
	 * This method adds two numbers
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return 0
	 */
	public double addition(double first, double second) {
		
		return first + second;
	}

	/**
	 * This method subtract first from second
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return 0
	 */
	public double subtraction(double first, double second) {
		
		return first - second;
	}
	
	/**
	 * This method divide two numbers
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return 0
	 */
	public double division(double first, double second) {
		
		return first/second;
	}

	/**
	 * This method multiply first with second
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return 0
	 */
	public double multiplication(double first, double second) {
		
		return first*second; 
	}

}
