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
		// max amount that big bricks can take
		int bigAmount = Math.min((goal / 5), big) * 5; 
		// if there are enough small bricks left to reach the goal
		if (goal - bigAmount <= small) return true;
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
		// must always start with big brick if possible
		if (canMakeBricks(small, big, goal)) {
			return goal - Math.min((goal / 5), big) * 5;
		} else return -1;
	}
	
}
