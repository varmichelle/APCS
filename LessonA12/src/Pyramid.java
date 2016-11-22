/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class Pyramid {

	/**
	 * Prints a pyramid
	 * @param n - number of lines the pyramid should have
	 */
	public static void pyramid(int n) {
		// i = number of stars in the line
		for (int i = 1; i <= 2*n - 1; i += 2) {
			// print initial spaces
			int spaces = (2*n - 1 - i)/2;
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			// print stars
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
