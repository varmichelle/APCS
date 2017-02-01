/**
 * Computes all primes less than N and tries to express N as a sum of two
 * primes. Goldbach's conjecture says that this is always possible if N is even
 * and greater than 2. When N is odd, these are called prime pairs.
 * 
 * @author Michelle Li 
 * Period 1
 */

public class Goldbach {
	
	private Eratosthenes e;
	private final int N;

	/**
	 * Constructor creates the list of primes using the class Eratosthenes and
	 * initializes N to the passed in value of n
	 * @param n - number to be written as a sum of two primes
	 */
	public Goldbach(int n) {
		e = new Eratosthenes(n);
		N = n;
	}

	/**
	 * Returns a string that includes all the prime pairs that add up to N
	 * 
	 * @return string with the all the prime pairs that add up to N
	 */
	public String sumOfTwoPrimes() {
		String[] answers = new String[N+1];
		int[] primes = e.listOfPrimes();
		for (int p1 = 0; p1 < primes.length; p1++) {
			for (int p2 = p1; p2 < primes.length; p2++) {
				int sum = primes[p1] + primes[p2];
				if (answers[sum].equals("")) {
					String s = sum + " = " + primes[p1] + " + " + primes[p2];
					answers[sum] = s;
				}
			}
		}
		String s = "";
		for (int i = 2; i <= N; i++) {
			if (answers[i].equals("")) s += i + " not expressible as sum of two primes";
			else s += answers[i];
		}
		return s;
	}
}
