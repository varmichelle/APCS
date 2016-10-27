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
	
	/**
	 * Method shorthand to convert string to shorthand (abbreviates and removes vowels)
	 * @param s - input string to convert to shorthand
	 * @return string in shorthand 
	 */
	
	public static String shorthand(String s) {
		// if it contains and, replace it with &
		int index = s.toLowerCase().indexOf("and");
		String pre = "", after = "";
		if (index >= 0) {
			if (index > 0) pre = s.substring(0, index);
			if (index < s.length() - 1) after = s.substring(index + 3);
			return shorthand(pre) + "&" + shorthand(after);
		}
		
		// if it contains to, replace it with 2
		index = s.toLowerCase().indexOf("to");
		pre = "";
		after = "";
		if (index >= 0) {
			if (index > 0) pre = s.substring(0, index);
			if (index < s.length() - 1) after = s.substring(index + 2);
			return shorthand(pre) + "2" + shorthand(after);
		}
		
		// if it contains you, replace it with U
		index = s.toLowerCase().indexOf("you");
		pre = "";
		after = "";
		if (index >= 0) {
			if (index > 0) pre = s.substring(0, index);
			if (index < s.length() - 1) after = s.substring(index + 3);
			return shorthand(pre) + "U" + shorthand(after);
		}
		
		// if it contains "for", replace it with 4
		index = s.toLowerCase().indexOf("for");
		pre = "";
		after = "";
		if (index >= 0) {
			if (index > 0) pre = s.substring(0, index);
			if (index < s.length() - 1) after = s.substring(index + 3);
			return shorthand(pre) + "4" + shorthand(after);
		}
		
		// remove any vowels if any
		int a = s.toLowerCase().indexOf("a");
		int e = s.toLowerCase().indexOf("e");
		int i = s.toLowerCase().indexOf("i");
		int o = s.toLowerCase().indexOf("o");
		int u = s.toLowerCase().indexOf("u");
		// handle all variables at once
		index = Math.max(a, Math.max(e, Math.max(i, Math.max(o, u))));
		pre = "";
		after = "";
		if (index >= 0) {
			if (index > 0) pre = s.substring(0, index);
			if (index < s.length() - 1) after = s.substring(index + 1);
			return shorthand(pre) + shorthand(after);
		}
		
		return s;

	}

}
