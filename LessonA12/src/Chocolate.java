/**
 * 
 * @author Michelle Li
 * Period 1
 * This class calculates how many bricks needed to reach goal
 *
 */

public class Chocolate {

	/**
	 * Calculates whether or not we have enough bricks to reach goal
	 * @param small - number of small bricks
	 * @param big - number of large bricks
	 * @param goal - goal wall length
	 * @return whether or not we can reach the goal
	 */
	public boolean canMakeBricks(int small, int big, int goal) {
		if (small + big * 5 >= goal) return true;
		else return false;
	}
	
	/**
	 * Returns number of small bricks needed to reach goal
	 * @param small - number of small bricks available
	 * @param big - number of large bricks available
	 * @param goal - goal wall length
	 * @return - number of small bricks needed
	 */
	public int numberOfSmallBricksNeeded(int small, int big, int goal) {
		// can't be done
		if (big * 5 + small < goal) return -1;
		// otherwise, print number of bricks needed
		else return goal - big * 5;
	}
	
}
