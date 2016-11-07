package calculator.git.otherclasses;

import calculator.git.interfaces.BasicOperations;

/**
 * This class implements BasicOperations
 * 
 * @author Saer, Senay, Johan
 * @version 1.0
 * @since 2016-11-02
 *
 */

public class BasicMethods implements BasicOperations{

	/**
	 * This method adds two numbers
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return first + second;
	 */
	public double addition(double first, double second) {
		
		return first + second;
	}

	/**
	 * This method subtract first from second
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return first - second;
	 */
	public double subtraction(double first, double second) {
		
		return first - second;
	}
	
	/**
	 * This method divide two numbers
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return result
	 */
	public double division(double first, double second) {
		
		double result=first/second;
		
		if(second==0){
			return -1000.0;
		}
		
		return result;
	}

	/**
	 * This method multiply first with second
	 * @param first takes a double first as parameter
	 * @param second takes a double second as parameter
	 * @return first*second;
	 */
	public double multiplication(double first, double second) {
		
		return first*second; 
	}

}
