/**
 * 
 * @author Michelle Li
 * Period 1
 * Class CheckProtection - secure a check
 *
 */

import java.util.*;

public class CheckProtection {

	// check amount
	private String amount;
	// spaces used to print the amount
	private final int MAX_LENGTH;
	
	/**
	 * Constructor to initialize MAX_LENGTH and amount
	 * also rounds amount to 2 decimal places, and makes sure it fits within MAX_LENGTH
	 * @param spaces - maximum number of decimal spaces
	 */
	
	public CheckProtection(int spaces) {
		MAX_LENGTH = spaces;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the check amount: ");
		double amt = scan.nextDouble();
		// round amount to 2 decimal places
		amount = "" + Math.round(amt * 100) / 100.0;
		// append an extra 0 after the decimal place if there's only 1 digit
		if (amount.length() - amount.indexOf(".") <= 2) amount += "0";
		if (amount.length() > MAX_LENGTH) System.out.println("Error: Amount takes too many digits");
		else printAmount();
	}
	
	/**
	 * Method printAmount() to print the amount on the check 
	 */
	
	public void printAmount() {
		System.out.println("amount = $" + addAsterisks(addCommas(amount)));
	}
	
	/**
	 * Method addAsterisks to insert leading asterisks in front a check
	 * @param s - string
	 * @return string with inserted asterisks
	 */
	
	public String addAsterisks(String s) {
		if (s.length() < MAX_LENGTH) return addAsterisks("*" + s);
		else return s;
	}

	/**
	 * Method addCommas to insert commas in the necessary places in the string
	 * @param s - string
	 * @return string with added commas
	 */
	
	public String addCommas(String s) {
		// handle decimals 
		if (s.indexOf(".") >= 0) {
			// insert commas into the integer portion, then append decimal portion at the end
			return addCommas(s.substring(0, s.length() - 3)) + s.substring(s.length() - 3, s.length());
		} else {
			if (s.length() <= 3) return s;
			else return addCommas(s.substring(0, s.length() - 3)) + "," + s.substring(s.length() - 3, s.length());
		}
	}
}
