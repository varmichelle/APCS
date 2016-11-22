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
	private boolean hasF = false;
	private String message;
	Scanner in = new Scanner(System.in);

	public void getGradesAndCalculateGPA() {
		while (in.hasNext()) {
			numGrades++;
			String s = in.next();
			if (s.toLowerCase().equals("a")) gpa += 4;
			else if (s.toLowerCase().equals("b")) gpa += 3;
			else if (s.toLowerCase().equals("c")) gpa += 2;
			else if (s.toLowerCase().equals("d")) gpa += 1;
			else if (s.toLowerCase().equals("f")) hasF = true;
		}
		if (numGrades < 4) {
			message = "Ineligible, taking less than 4 classes";
		} else {
			 gpa /= numGrades;
			 if (gpa < 2) {
				 if (hasF) message = "Ineligible, gpa below 2.0 and has F grade";
				 else message = "Ineligible, gpa below 2.0";
			 } else {
				 if (hasF) message = "Ineligible, gpa above 2.0 but has F grade";
				 else message = "Eligible";
			 }
		}
	}
	
	public void printMessage() {
		System.out.println(message);
	}
	
}
