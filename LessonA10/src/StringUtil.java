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
	
	/**
	 * Method palindrome - checks if the given string is a palindrome or not
	 * @param s - string to check if it's a palindrome
	 * @return boolean (true/false) if it's a palindrome
	 */
	
	public static boolean palindrome(String s) {
		s = palindromeHelper(s);
		if (s.length() <= 1) return true;
		else return ((s.charAt(0) == s.charAt(s.length() - 1)) && palindrome(s.substring(1, s.length() - 1)));
	}
	
	/**
	 * Private helper method palindromeHelper to help the palindrome method
	 * @param s - input string
	 * @return - string in lower case with non-letters removed
	 */
	
	private static String palindromeHelper(String s) {
		s = s.toLowerCase();
		if (s.length() == 0) return "";
		// if the character is not a letter
		else if (s.charAt(0) < 'A' || s.charAt(0) > 'z' || (s.charAt(0) > 'Z' && s.charAt(0) < 'a')) {
			return palindromeHelper(s.substring(1));
		} else return s.charAt(0) + palindromeHelper(s.substring(1));
	}
	
	public static String shorthand(String s) {
		
	}

}
