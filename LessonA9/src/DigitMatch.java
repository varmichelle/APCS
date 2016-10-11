/**
 *   
 * @author Michelle Li
 * Period 1
 * Class DigitMatch 
 */

public class DigitMatch {
	
	/**
	 * Method countMatch counts the number of matching digits of two input integers
	 * @param a - first integer
	 * @param b - second integer
	 * @return number of digits matched
	 */
	public int countMatch(int a, int b) {
		
		if (a <= 0 || b <= 0) return 0;
		else {
			if (a % 10 == b % 10) return 1 + countMatch(a/10, b/10);
		}
		return 0;
		
	}

}
