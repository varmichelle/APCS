/**
 * 
 * @author Michelle Li
 * Period 1
 * This class simulates the board game GameLand
 *
 */

import java.util.*;

public class GameLand {

	private Random random;
	int roll1, roll2, location1, location2;
	
	/**
	 * Constructor to initialize Random object with given seed
	 * @param seed - seed for the random number generator
	 */
	public GameLand(int seed) {
		random = new Random(seed);
	}
	
	/**
	 * Simulates the roll of 2 die
	 */
	public void roll() {
		roll1 = random.nextInt(6) + 1;
		roll2 = random.nextInt(6) + 1;
	}
	
	/**
	 * Simulates the moving of each player until game is over
	 */
	public void moving() {
		while (location1 < 100 && location2 < 100) {
			// player A rolls
			roll();
			System.out.print("Player A rolled a " + (roll1 + roll2));
			// 2 or 12 means the player can't move
			if (roll1 + roll2 == 2 || roll1 + roll2 == 12) {
				System.out.println(" >>> ** Player A is now at " + location1);
			} 
			// 7 means the player moves backwards up to 7 spaces
			else if (roll1 + roll2 == 7) {
				if (location1 > 7) location1 -= 7;
				else location1 = 0;
				System.out.println(" >>> ******* Player A is now at " + location1);
			}
			else {
				location1 += roll1 + roll2;
				// player A landed on same square as player B
				if (location1 == location2) {
					// player B bumped back to start
					location2 = 0;
					System.out.println(" >>> - BUMPED - Player A is now at " + location1);
				} else {
					// check for win
					if (location1 > 100) {
						System.out.println(" >>> Player A WINS!!!");
						System.out.println("Player A is now at " + location1);
						System.out.println("Player B is now at " + location2);
						continue;
					}
					// otherwise, it's a normal move
					System.out.println(" >>> Player A is now at " + location1);
				}
			}
			
			// player B rolls
			roll();
			System.out.print("Player B rolled a " + (roll1 + roll2));
			// 2 or 12 means the player can't move
			if (roll1 + roll2 == 2 || roll1 + roll2 == 12) {
				System.out.println(" >>> ** Player B is now at " + location2);
			} 
			// 7 means the player moves backwards up to 7 spaces
			else if (roll1 + roll2 == 7) {
				if (location2 > 7) location2 -= 7;
				else location2 = 0;
				System.out.println(" >>> ******* Player B is now at " + location2);
			}
			else {
				location2 += roll1 + roll2;
				// player B landed on same square as player A
				if (location1 == location2) {
					// player A bumped back to start
					location1 = 0;
					System.out.println(" >>> - BUMPED - Player B is now at " + location2);
				} else {
					// check for win
					if (location2 > 100) {
						System.out.println(" >>> Player B WINS!!");
						System.out.println("Player A is now at " + location1);
						System.out.println("Player B is now at " + location2);
						continue;
					}
					// otherwise, it's a normal move
					System.out.println(" >>> Player B is now at " + location2);
				}
			}
		}
	}
	
}
