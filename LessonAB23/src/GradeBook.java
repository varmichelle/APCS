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
		for (int row = 0; row < gradesArray.length; row++) {
			for (int col = 0; col < gradesArray[0].length; col++) {
				grades[row][col] = gradesArray[row][col];
			}
		}
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
	
	public void outputBarChart() {
		
	}
	
	public void outputGrades() {
		
	}
	
	/**
	 * Print information related to grades
	 * Minimum, maximum, grades, distribution chart
	 */
	public void processGrades() {
		System.out.println("Lowest grade is " + getMinimum());
		System.out.println("Highest grade is " + getMaximum());
		System.out.println("The grades are: ");
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
		System.out.println("Welcome to the gradebook for\nAPCS - AP Computer Science!");
	}
	
}

