/**
 * Class Rolling to simulate rolling 3 dice until 3 different values
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class Rolling {
	
	private Random random;

	/**
	 * Constructor to initialize seeded random number generator
	 * @param seed - seed for the random number generator
	 */
	public Rolling(int seed) {
		random = new Random(seed);
	}
	
	/**
	 * Simulates a game of rolling dice 
	 * Continue to roll the 3 dice until different numbers are achieved
	 * Count the number of rolls it takes
	 */
	public void play() {
		int rollCount = 0;
		int r1 = 0, r2 = 0, r3 = 0;
		do {
			// roll the dice
			r1 = roll();
			r2 = roll();
			r3 = roll();
			System.out.println(r1 + " " + r2 + " " + r3);
			rollCount++;
		} while (r1 == r2 || r1 == r3 || r2 == r3);
		
		/**
		 * Negating the loop condition tells us that when the loop is done,
		 * r1 != r2 && r1 != r3 && r2 != r3 (all 3 dice are different)
		 */
		
		System.out.println("Rolled " + rollCount + " times before all the rolls were different");
	}
	
	/**
	 * Simulates a dice roll
	 * @return
	 */
	private int roll() {
		return random.nextInt(6) + 1;
	}

}
