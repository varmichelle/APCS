/**
 * Class RichterScale - outputs damage to buildings given magnitude
 * @author Michelle Li
 * Period 1
 *
 */

public class RichterScale {

	
	/**
	 * method to determine and print appropriate message for earthquake damage
	 * @param magnitude double for the magnitude of the earthquake
	 */
	public static void effect(double magnitude) {
		
		if (magnitude >= 8) System.out.println("Most structures fall");
		else if (magnitude >= 7) System.out.println("Many buildings destroyed");
		else if (magnitude >= 6) System.out.println("Many buildings considerably damaged, some collapse");
		else if (magnitude >= 4.5) System.out.println("Damage to poorly constructed buildings");
		else System.out.println("No destruction of buildings");
		
	}

}