/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class FunLoops {

	/**
	 * Prints the first n magic squares
	 * @param n - number of magic squares to print
	 */
	public static void magicSquares(int n) {
		// numMagicSquares stores the number of magic squares found
		// current stores the number n with the current magic number to check 
		// .. being 1 + 2 + ... + current
		int numMagicSquares = 0, current = 1;
		// while we haven't found all the magic squares yet
		while (numMagicSquares < n) {
			// find 1 + 2 + ... + current
			int sum = 0;
			for (int i = 1; i <= current; i++) sum += i;
			// increment current because we've already finished this value
			current++;
			double sqrt = Math.sqrt(sum);
			// if the sum isn't a perfect square, continue to search for the next magic number
			if (sqrt - (int) sqrt > 0) continue;
			// otherwise print the number and increment the number of magic squares found
			else System.out.println(sum);
			numMagicSquares++;
		}
	}

}
