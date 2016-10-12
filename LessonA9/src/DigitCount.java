import java.util.Random;

/**
 * 
 * @author Michelle Li
 * Period 1
 * Class DigitCount - counts the number of digits in a given number
 *
 */

public class DigitCount {
	
	private Random rand;
	private int number;
	private int count = 0;

	/**
	 * Constructor to initialize random number generator with a given seed
	 * @param seed - used to pseudo-randomize the random number generator
	 */
	public DigitCount(int seed) {
		rand = new Random(seed);
	}
	
	/**
	 * Method generateNewNumber to generate a random number given a maximum, sets number to the generated number and resets count to 0
	 * @param max - maximum number to be generated, exclusive
	 * @return random number
	 */
	
	public int generateNewNumber(int max) {
		number = rand.nextInt(max);
		count = 0;
		return number;
	}
	
	/**
	 * Method countDigits to count the number of digits in the given number, sets count to the number of digits
	 * @param num - the number to count digits
	 * @return number of digits
	 */
	public int countDigits(int num) {
		// base case
		if (num == 0) return 0;
		// recursive step
		else count += 1 + countDigits(num/10);
		return count;
	}

}
