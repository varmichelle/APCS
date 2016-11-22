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

	public void getGradesAndCalculateGPA() {
	  numGrades = 0;
	  gpa = 0;
	  hasF = 0;
	  System.out.print("Enter your grades: ");
	  String s = in.next();
		while ((s.toLowerCase().charAt(0) >= 'a' && s.toLowerCase().charAt(0) <= 'd') || s.toLowerCase().charAt(0) == 'f') {
			numGrades++;
			if (s.toLowerCase().equals("a")) gpa += 4;
			else if (s.toLowerCase().equals("b")) gpa += 3;
			else if (s.toLowerCase().equals("c")) gpa += 2;
			else if (s.toLowerCase().equals("d")) gpa += 1;
			else if (s.toLowerCase().equals("f")) hasF = 1;
			s = in.next();
		}
	  gpa /= numGrades;
    System.out.printf("GPA = %.2f\n", gpa);
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
	
	public void printMessage() {
		System.out.println(message);
	}
	
}
