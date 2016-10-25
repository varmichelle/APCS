/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */
public class Negation {

	/**
	 * Static method negate - replaces all 0's with 1's and vice versa
	 * @param s - string to negate
	 * @return - negated string
	 */
	public static String negate(String s) {
		return negateHelper(s, 0);
	}
	
	/**
	 * Private static helper method negateHelper - uses recursion to negate the string
	 * @param original - original input string
	 * @param index - index of current position in the string
	 * @return - negated string
	 */
	private static String negateHelper(String original, int index) {
		String newStr = "";
		if (index >= original.length()) return "";
		else {
			if (original.charAt(index) == '0') newStr += '1' + negateHelper(original, index + 1);
			else newStr += '0' + negateHelper(original, index + 1);
		}
		return newStr;
	}

}
