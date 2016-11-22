/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class Grades {

	private int numGrades = 0;
	private double gpa = 0;
	private int hasF = 0; // 0 = F, 1 = T
	private String message;
	Scanner in = new Scanner(System.in);

	/**
	 * Takes in grades input and calculates gpa
	 */
	public void getGradesAndCalculateGPA() {
		// reset everything
		numGrades = 0;
		gpa = 0;
		hasF = 0;
		System.out.print("Enter your grades: ");
		// take in input
		String s = in.next();
		// break if s isn't a legal grade character
		while ((s.toLowerCase().charAt(0) >= 'a' && s.toLowerCase().charAt(0) <= 'd') || s.toLowerCase().charAt(0) == 'f') {
			numGrades++;
			// add appropriate value to gpa
			if (s.toLowerCase().equals("a")) gpa += 4;
			else if (s.toLowerCase().equals("b")) gpa += 3;
			else if (s.toLowerCase().equals("c")) gpa += 2;
			else if (s.toLowerCase().equals("d")) gpa += 1;
			else if (s.toLowerCase().equals("f")) hasF = 1;
			s = in.next();
		}
		// compute and print gpa
		gpa /= numGrades;
		System.out.printf("GPA = %.2f\n", gpa);
		// set the appropriate message
		if (numGrades < 4) {
			message = "Ineligible, taking less than 4 classes";
		} else {
			if (gpa < 2) {
				if (hasF == 1) message = "Ineligible, gpa below 2.0 and has F grade";
				else message = "Ineligible, gpa below 2.0";
			} else {
				if (hasF == 1) message = "Ineligible, gpa above 2.0 but has F grade";
				else message = "Eligible";
			}
		}
	}

	/**
	 * Prints message
	 */
	public void printMessage() {
		System.out.println(message);
	}

}
