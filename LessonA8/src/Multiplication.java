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
		
		if (b < 0) {
			a *= -1;
			b *= -1;
		}
		int product = 0;
		if (b == 0) return 0;
		if (b > 0) {
			product += a + mult(a, b-1);
		}
		return product;
		
	}

}
