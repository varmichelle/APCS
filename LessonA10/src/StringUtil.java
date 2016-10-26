/**
 * 
 * @author Michelle Li
 * Period 1
 * Class StringUtil - several useful string methods, such as reversal, shorthand, palindrome
 *
 */

public class StringUtil {

	/**
	 * Method reverse to reverse a given string
	 * @param s - string to be reversed
	 * @return reversed string
	 */
	
	public static String reverse(String s) {
		if (s.length() == 1) return s;
		else return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
	}
	
	public static boolean palindrome(String s) {
		// if (s.length() <= 1) return true;
		// else return ((s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 2)));
	}
	
	public static String shorthand(String s) {
		
	}

}
