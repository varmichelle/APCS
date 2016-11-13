/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class SubstringChecker implements Checker {

	private String substring;
	
	/**
	 * Constructor to initialize instance variables
	 * @param substring - substring to check for
	 */
	public SubstringChecker(String substring) {
		this.substring = substring;
	}
	
	/**
	 * Method accept to determine whether or not the checker will accept input text
	 * @param text - text to check
	 * @return if checker accepts text
	 */
	public boolean accept(String text) {
		return text.contains(substring);
	}

}
