/**
 * Class Number - represents numbers with different bases
 * @author Michelle Li
 * Period 1
 */

import java.util.*;

public class Number {
	
	private int base, value;
	private ArrayList<Digit> digits = new ArrayList<Digit>();
	
	/**
	 * Constructor to initialize base to 10 and number to 0
	 */
	public Number() {
		base = 10;
		value = 0;
		digits.add(new Digit(0,base));
	}
	
	/**
	 * Constructor to initialize base and number as given
	 * @param v - number in decimal
	 * @param b - base to convert v to
	 */
	public Number(int v, int b) {
		base = b;
		value = v;
		int copy = value;
		int numDigits = 0;
		int divideBy = 1;
		while (copy > 0) {
			copy /= base;
			numDigits++;
			divideBy *= base;
		}
		divideBy /= base;
		copy = value;
		for (int i = 0; i < numDigits; i++) {
			digits.add(new Digit (copy / divideBy, base));
			copy %= divideBy;
			divideBy /= base;
		}
		if (value == 0) digits.add(new Digit(0, base));
	}
		
	/**
	 * Convert the number into a format for printing
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < digits.size(); i++) {
			if (digits.get(i).getValue() < 10) s += digits.get(i);
			else s += (char) ('A' + digits.get(i).getValue() - 10);
		}
		return s;
	}
	
	/**
	 * Increment the number by 1
	 * @return true if there is a carry (false otherwise)
	 */
	public boolean increment() {
		boolean carry = false;
		for (int i = digits.size() - 1; i >= 0; i--) {
			if (! digits.get(i).increment()) break;
			carry = true;
			if (i == 0) digits.add(0, new Digit(1,base));
		}
		return carry;
	}
	
}
