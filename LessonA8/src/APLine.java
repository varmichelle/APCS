/**
 * Class APLine
 * @author Michelle Li
 * Period 1
 *
 */
public class APLine {

	private static int a, b, c;
	
	/**
	 * Constructor to initialize a, b, and c
	 * @param newA - value of a in ax + by + c = 0
	 * @param newB - value of b in ax + by + c = 0
	 * @param newC - value of c in ax + by + c = 0
	 */
	
	public APLine(int newA, int newB, int newC) {
		a = newA;
		b = newB;
		c = newC;
	}
	
	/**
	 * Method getSlope() to return the slope of the line
	 * @return slope (-a/b)
	 */
	public double getSlope() {
		return -1.0 * a / (double) b;
	}
	
	/**
	 * Method isOnLine() to check if the given point is on the line
	 * @param x - x coordinate of given point
	 * @param y - y coordinate of given point
	 * @return isOnLine (true if yes, false if no)
	 */
	public boolean isOnLine(int x, int y) {
		if (a * x + b * y + c == 0) return true;
		else return false;
	}

}
