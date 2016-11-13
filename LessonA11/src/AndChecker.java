/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class AndChecker implements Checker {

	private Checker aChecker, bChecker;
	
	/**
	 * Constructor to initialize instance variables
	 * @param bChecker2 - first substring checker
	 * @param cChecker - second substring checker
	 */
	public AndChecker(Checker bChecker2, Checker cChecker) {
		this.aChecker = bChecker2;
		this.bChecker = cChecker;
	}
	
	/**
	 * Method accept to determine if checker accepts text
	 * @param text - text to check
	 * @return if checker accepts text
	 */
	public boolean accept(String text) {
		return aChecker.accept(text) && bChecker.accept(text);
	}

}
