/**
 *   
 * @author Michelle Li
 * Period 1
 * Class Multiplication - multiplies two numbers recursively
 */

public class Multiplication {
	
	/**
	 * Method mult - calculates the product of two numbers recursively
	 * @param a - first number
	 * @param b - second number
	 * @return product - product of the two numbers
	 */
	
	public int mult(int a, int b) {
		
		// handle negative numbers
		if (b < 0) {
			a *= -1;
			b *= -1;
		}
		int product = 0;
		// base case
		if (b == 0) return 0;
		// recursive calls (add a to product b times)
		if (b > 0) {
			product += a + mult(a, b-1);
		}
		return product;
		
	}

}
