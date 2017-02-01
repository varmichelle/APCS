/**
 * Determines the primes less than or equal to n using the Sieve of Eratosthenes
 * @author Michelle Li
 * Period #1
 *
 */

import java.util.*;

public class Eratosthenes {
	
	// Instance variables
	private int[] numbers;
	
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n) {
		numbers = new int[n-1];
		for (int i = 2; i <= n; i++) {
			numbers[i-2] = i;
		}
		for (int i = 0; i <= n-2; i++) {
			if (numbers[i] != -1) {
				for (int j = i + 1; j <= n-2; j++) {
					if (numbers[j] % numbers[i] == 0) {
						numbers[j] = -1;
					}
				}
			}
		}
	}
	
	/** Count the number of primes
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes() {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != -1) count++;
		}
		return count;
	}
	
	/**
	 * returns a list of primes less than or equal to n
	 * @return list of primes
	 */
	public int[] listOfPrimes() {
		int[] primes = new int[countPrimes()];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != -1) {
				primes[index] = numbers[i];
				index++;
			}
		}
		return primes;
	}
	
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 */
	public String toString(){
		String s = "";
		int[] primes = listOfPrimes();
		for (int i = 0; i < primes.length; i++) {
			s += primes[i];
			if (i != primes.length - 1) s += " ";
			else s += "\n";
		}
		s += "Number of primes less than or equal to " + (numbers.length+1) + " = " + countPrimes();
		return s;
	}
}
