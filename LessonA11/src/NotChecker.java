/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class NotChecker implements Checker {

	private Checker aChecker, bChecker;
	
	/**
	 * Constructor to initialize instance variables
	 * @param aChecker - first substring checker
	 * @param bChecker - second substring checker
	 */
	public NotChecker(Checker aChecker, Checker bChecker) {
		this.aChecker = aChecker;
		this.bChecker = bChecker;
	}
	
	/**
	 * Method accept to determine if checker accepts text
	 * @param text - text to check
	 * @return if checker accepts text
	 */
	public boolean accept(String text) {
		return !(aChecker.accept(text) || bChecker.accept(text));
	}

}
