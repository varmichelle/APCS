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
		
		// if reached end of number, stop
		// this checks if we're done, if both numbers are 0 
		if (a == 0 && b == 0) return 0;
		// this handles the case where a number is less than 10 (and therefore handles the 0 case)
		else if (a < 10 || b < 10) {
			if (a % 10 == b % 10) return 1;
			else return 0;
		}
		else {
			// otherwise check the last digit and recurse
			if (a % 10 == b % 10) {
				return 1 + countMatch(a/10, b/10);
			}
			else return countMatch(a/10, b/10);
		}
		
	}

}
