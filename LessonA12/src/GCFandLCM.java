/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class GCFandLCM {
	
	/**
	 * Calculates gcf of 2 numbers using Euclidean algorithm
	 * @param a - first input number
	 * @param b - second input number
	 * @return gcf
	 */
	public int GCF(int a, int b) {
		if (a == b) return a;
		else {
			if (a > b) return GCF(a, a-b);
			else return GCF(a,b-a);
		}
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
