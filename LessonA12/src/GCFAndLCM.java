/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class GCFAndLCM {
	
	/**
	 * Calculates gcf of 2 numbers using Euclidean algorithm
	 * @param a - first input number
	 * @param b - second input number
	 * @return gcf
	 */
	public int GCF(int a, int b) {
		while (a != b) {
			if (a > b) a -=b;
			else b -= a;
		}
		return a;
	}
	
	/**
	 * Calculates lcm of 2 numbers 
	 * @param a - first input number
	 * @param b - second input number 
	 * @return lcm
	 */
	public int LCM(int a, int b) {
		return a * b / GCF(a,b);
	}

}
