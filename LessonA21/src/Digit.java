/**
 * Class Number - represents numbers with different bases
 * @author Michelle Li
 * Period 1
 */

import java.util.*;

public class Digit {

	private int base, value;
	
	/**
	 * Constructor to initialize base to 10 and number to 0
	 */
	public Digit() {
		base = 10;
		value = 0;
	}
	
	/**
	 * Constructor to initialize base and value as given
	 * @param v - number in decimal
	 * @param b - base to convert v to
	 */
	public Digit(int v, int b) {
		base = b;
		value = v;
	}
	
	/**
	 * Convert the digit into a format for printing
	 */
	public String toString() {
		return "" + value;
	}
	
	/**
	 * Increment the digit by 1
	 * @return true if there is a carry (false otherwise)
	 */
	public boolean increment() {
		value++;
		value %= base;
		if (value == 0) return true;
		else return false;		
	}
	
	/**
	 * Getter method for value
	 * @return value
	 */
	public int getValue() {
		return value;
	}
}
