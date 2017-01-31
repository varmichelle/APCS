/**
 * Class Student to simulate a student
 * @author Michelle Li
 * @period 1
 *
 */

public class Student {
	
	// instance variables
	private String name;
	private final int NUM_TESTS = 3;
	private int[] testScores = new int[NUM_TESTS];
	
	/**
	 * Constructor to initialize name to empty String and testScores to 0
	 */
	public Student() {
		name = "";
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores[i] = 0;
		}
	}
	
	/**
	 * Constructor to initialize name to given value and test scores to 0
	 * @param a - name of student
	 */
	public Student(String a) {
		name = a;
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores[i] = 0;
		}
	}
	
	/**
	 * Constructor to initialize name to given value and test scores to given values
	 * @param a - name of student
	 * @param nums - test scores of student
	 */
	public Student(String a, int[] nums) {
		name = a;
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores[i] = nums[i];
		}
	}
	
	/**
	 * Constructor to initialize Student to given Student
	 * @param other - other Student
	 */
	public Student(Student other) {
		name = other.getName();
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores[i] = other.getScore(i);
		}
	}
	
	/**
	 * Set the name of the student to given value
	 * @param a - name of student
	 */
	public void setName(String a) {
		name = a;
	}
	
	/**
	 * Get the name of the student
	 * @return name - name of student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the test scores of the student
	 * @param test - index of test score to set
	 * @param score - the score to set
	 */
	public void setScore(int test, int score) {
		testScores[test] = score;
	}
	
	/**
	 * Sets the test scores of the student
	 * @param scores - array of scores to set
	 */
	public void setScore(int[] scores) {
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores[i] = scores[i];
		}
	}
	
	/**
	 * Get the test score of the student
	 * @param test - index of test score to get
	 * @return testScores[test] - the test score requested
	 */
	public int getScore(int test) {
		return testScores[test];
	}
	
	/**
	 * Get the average test score
	 * @return avg - avg test score
	 */
	public int getAverage() {
		int avg = 0;
		for (int i = 0; i < NUM_TESTS; i++) avg += testScores[i];
		avg /= NUM_TESTS;
		return avg;
	}
	
	/**
	 * Get the highest test score
	 * @return max - highest score
	 */
	public int getHighScore() {
		int max = 0;
		for (int i = 0; i < NUM_TESTS; i++) max = Math.max(max, testScores[i]);
		return max;
	}
	
	/**
	 * Get the data of the Student in string form
	 * @return data in string form
	 */
	public String toString() {
		return "";
	}
	
}
