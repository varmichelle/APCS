/**
 * @author Michelle Li
 * @period #1
 * Class GradeBook - stores grades of students
 */

public class GradeBook {

	private String courseName;
	private int[][] grades;
	
	public GradeBook(String name, int[][] gradesArray) {
		courseName = name;
		for (int row = 0; row < gradesArray.length; row++) {
			for (int col = 0; col < gradesArray[0].length; col++) {
				grades[row][col] = gradesArray[row][col];
			}
		}
	}
	
	public int getMinimum() {
		int min = 999999;
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[0].length; col++) {
				min = Math.min(min, grades[row][col]);
			}
		}
		return min;
	}
	
	public int getMaximum() {
		int max = 0;
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[0].length; col++) {
				max = Math.max(max, grades[row][col]);
			}
		}
		return max;
	}
	
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
	
	public void processGrades() {
		
	}
	
}

