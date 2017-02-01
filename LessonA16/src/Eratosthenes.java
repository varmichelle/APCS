/**
 * Determines the primes less than or equal to n using the Sieve of Eratosthenes
 * @author Michelle Li
 * Period #1
 *
 */

import java.util.*;

public class Eratosthenes {
	
	// Instance variables
	private int[] primes;
	
	/**
	 * Constructor to initialize array of primes using the Sieve of Eratosthenes
	 * @param n - all primes are less than or equal to n
	 */
	public Eratosthenes (int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// fill with numbers from 2 to n initially
		for (int i = 2; i <= n; i++) {
			numbers.add(i);
		}
		for (int i = 2; i <= n; i++) {
			
		}
	}
	
	/** Count the number of primes
	 * @return number of primes less than or equal to n
	 */
	public int countPrimes()
	{
		//Your code goes here
	}
	
	/**
	 * returns a list of primes less than or equal to n
	 * @return
	 */
	public int[] listOfPrimes()
	{
		//Your code goes here
	}
	
	/**
	 * Returns a string containing the prime numbers and the number of prime numbers
	 * in the list
	 */
	public String toString()
	{
		//Your code goes here
	}
}
