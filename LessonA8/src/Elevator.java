/**
 * Class Elevator - simulates an elevator
 * @author: Michelle Li
 * Period: 1
 */

import java.util.*;

public class Elevator {

	private Scanner scan = new Scanner(System.in);
	
	private final int MAX_FLOORS = 20;
	
	/**
	 * Method to print appropriate message given floor number
	 * Checks to make sure floor is an int, not 13, and in the range 1 - MAX_FLOORS
	 */
	public void simulate() {
		// prompt user to enter floor
		System.out.print("Floor: ");
		// if the input is not an integer (string etc), print an error message
		if (!scan.hasNextInt()) System.out.println("Error: Not an integer");
		// if the input is an integer:
		else {
			// read input
			int floor = scan.nextInt();
			// print appropriate messages depending on floor
			if (floor == 13) System.out.println("Error: There is no thirteenth floor");
			else if (floor > MAX_FLOORS || floor <= 0) 
				System.out.println("Error: The floor must be between 1 and " + MAX_FLOORS);
			else if (floor > 13) System.out.println("Thank you, I will take you to the actual floor " + (floor - 1));
			else System.out.println("Thank you, I will take you to the actual floor " + floor);
			
		}
	}

}
