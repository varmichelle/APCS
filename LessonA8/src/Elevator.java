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
	 *  
	 */
	public void simulate() {
		System.out.println("Floor: ");
		if (!scan.hasNextInt()) System.out.println("Error: Not an integer");
		else {
			int floor = scan.nextInt();
			if (floor == 13) System.out.println("Error: There is no thirteenth floor");
			else if (floor > MAX_FLOORS || floor <= 0) 
				System.out.println("Error: The floor must be between 1 and " + MAX_FLOORS);
			else if (floor > 13) System.out.println("Thank you, I will take you to the actual floor " + (floor - 1));
			else System.out.println("Thank you, I will take you to the actual floor " + floor);
			
		}
	}

}
