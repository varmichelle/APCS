/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class MultiplicationTable {

	/**
	 * Prints a multiplication table
	 * @param rows - number of rows in the table
	 * @param cols - number of columns in the table
	 */
	public void printTable(int rows, int cols) {
		// initial 1
		System.out.printf("%9d", 1);
		// column headings
		for (int i = 2; i <= cols; i++) {
			System.out.printf("%7d", i);
		}
		// double space
		System.out.print("\n\n");
		for (int i = 1; i <= rows; i++) {
			// row headings
			System.out.printf("%2d", i);
			// table elements
			for (int j = 1; j <= cols; j++) {
				System.out.printf("%7d", i*j);
			}
			System.out.println();
		}
	}

}
