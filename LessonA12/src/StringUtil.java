/**
 * 
 * @author Michelle Li
 * Period 1
 * This class converts a string from english to pig latin
 *
 */

public class StringUtil {
	
	private static String output = "";

	/** 
	 * Converts a string to it piglatin form according to the following rules:
	 * a. If there are no vowels in englishWord, then pigLatinWord is just
	 * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
	 * and 'u', and their uppercase counterparts.)
	 * b. Else, if englishWord begins with a vowel, then pigLatinWord is just
	 * englishWord + "yay".
	 * c. Otherwise (if englishWord has a vowel in it and yet doesn't start
	 * with a vowel), then pigLatinWord is end + start + "ay", where end
	 * and start are defined as follows:
	 * 1. Let start be all of englishWord up to (but not including) its
	 * first vowel.
	 * 2. Let end be all of englishWord from its first vowel on.
	 * 3. But, if englishWord is capitalized, then capitalize end and
	 * "uncapitalize" start.
	 *
	 * @param s - input text
	 * @return piglatin version of text as a String 
	 */
	public static String phraseToPigLatin(String s) {
		String piglatin = ""; // stores the current piglatin version
		String currentWord = s.charAt(0) + ""; // current word to be piglatinified
		boolean previousIsLetter = true; // if the previous char is a letter
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			// if it's a letter
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				currentWord += c;
				previousIsLetter = true;
			// if not a letter (space or punctuation)
			} else {
				if (previousIsLetter) piglatin += pigLatinify(currentWord);
				previousIsLetter = false;
				currentWord = "";
				piglatin += c;
			}
		}
		if (previousIsLetter) piglatin += pigLatinify(currentWord);
		return piglatin;
	}
	
	/**
	 * Private helper method for phraseToPigLatin, converts word to pig latin
	 * @param s - input word
	 * @return - word in pig latin
	 */
	private static String pigLatinify(String s) {
		String lowercase = s.toLowerCase();
		// if word has no vowels, just append "ay"
		if (lowercase.indexOf('a') == -1 && lowercase.indexOf('e') == -1 && lowercase.indexOf('i') == -1 && lowercase.indexOf('o') == -1 && lowercase.indexOf('u') == -1) {
			return s + "ay";
		}
		// if word begins with a vowel, pig latin version just appends "yay"
		else if (lowercase.charAt(0) == 'a' || lowercase.charAt(0) == 'e' || lowercase.charAt(0) == 'i' || lowercase.charAt(0) == 'o' || lowercase.charAt(0) == 'u') {
			return s + "yay";
		}
		// otherwise, the word must contain vowel(s) but not at the beginning
		else {
			int indexOfA = lowercase.indexOf("a");
			if (indexOfA == -1) indexOfA = 99999999;
			int indexOfE = lowercase.indexOf("e");
			if (indexOfE == -1) indexOfE = 99999999;
			int indexOfI = lowercase.indexOf("i");
			if (indexOfI == -1) indexOfI = 99999999;
			int indexOfO = lowercase.indexOf("o");
			if (indexOfO == -1) indexOfO = 99999999;
			int indexOfU = lowercase.indexOf("u");
			if (indexOfU == -1) indexOfU = 99999999;
			int index = Math.min(Math.min(indexOfA, indexOfE), Math.min(indexOfI, Math.min(indexOfO, indexOfU)));
			String start = s.substring(0, index);
			String end = s.substring(index);
			// if capitalized
			if (s.charAt(0) < 'a') {
				if (end.length() > 1) end = end.substring(0, 1).toUpperCase() + end.substring(1);
				else end = end.toUpperCase();
				if (start.length() > 1) start = start.substring(0, 1).toLowerCase() + start.substring(1);
				else start = start.toLowerCase();
			}
			return end + start + "ay";
		}
	}
	
}
