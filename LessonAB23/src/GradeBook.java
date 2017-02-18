/**
 * @author Michelle Li
 * @period #1
 * Class GradeBook - stores grades of students
 */

public class GradeBook {

	private String courseName;
	private int[][] grades;
	
	/**
	 * Constructor to initialize instance variables
	 * @param name - name of course
	 * @param gradesArray - student grades
	 */
	public GradeBook(String name, int[][] gradesArray) {
		courseName = name;
		grades = gradesArray;
	}
	
	/**
	 * Get minimum grade
	 * @return minimum
	 */
	public int getMinimum() {
		int min = 999999;
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[0].length; col++) {
				min = Math.min(min, grades[row][col]);
			}
		}
		return min;
	}
	
	/**
	 * Get maximum grade
	 * @return maximum
	 */
	public int getMaximum() {
		int max = 0;
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[0].length; col++) {
				max = Math.max(max, grades[row][col]);
			}
		}
		return max;
	}
	
	/**
	 * Get average of a set of grades
	 * @param setOfGrades - grades to average
	 * @return average
	 */
	public double getAverage(int[] setOfGrades) {
		double avg = 0;
		for (int i = 0; i < setOfGrades.length; i++) {
			avg += setOfGrades[i];
		}
		avg /= setOfGrades.length;
		return avg;
	}
	
	/**
	 * Print bar chart grade distribution
	 */
	public void outputBarChart() {
		int[] distribution = new int[11];
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[row].length; col++) {
				distribution[grades[row][col]/10]++;
			}
		}
		for (int i = 0; i <= 9; i++) {
			System.out.print(i+"0-"+i+"9: ");
			for (int j = 0; j < distribution[i]; j++) System.out.print("*");
			System.out.println();
		}
		System.out.print("  "+100+": ");
		for (int j = 0; j < distribution[10]; j++) System.out.print("*");
		System.out.println();
	}
	
	/**
	 * Print grades and average for each student
	 */
	public void outputGrades() {
		System.out.println("                Test 1  Test 2  Test 3  Average");
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Student");
			System.out.printf("%3s", (i+1)+"");
			System.out.print("      ");
			for (int j = 1; j <= 3; j++) {
				System.out.printf("%-7s", grades[i][j-1]+"");
				System.out.print(" ");
			}
			System.out.printf("%.2f\n", getAverage(grades[i]));
		}		
	}
	
	/**
	 * Print information related to grades
	 * Minimum, maximum, grades, distribution chart
	 */
	public void processGrades() {
		System.out.println("Lowest grade is " + getMinimum());
		System.out.println("Highest grade is " + getMaximum()+"\n");
		System.out.println("The grades are: \n");
		outputGrades();
		System.out.println("Overall grade distribution");
		outputBarChart();
	}
	
	/**
	 * Set course name
	 * @param name - name to set
	 */
	public void setCourseName(String name) {
		courseName = name;
	}
	
	/**
	 * Get course name
	 * @return courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	
	/**
	 * Display a message to introduce the course
	 */
	public void displayMessage() {
		System.out.println("Welcome to the gradebook for\nAPCS - AP Computer Science!\n\n");
	}
	
}

