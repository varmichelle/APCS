/**
 * Class Student to simulate a student
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class Student2 {
	
	// instance variables
	private String name;
	private final int NUM_TESTS = 3;
	private ArrayList<Integer> testScores = new ArrayList<Integer>();
	
	/**
	 * Constructor to initialize name to empty String and testScores to 0
	 */
	public Student2() {
		name = "";
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores.add(0);
		}
	}
	
	/**
	 * Constructor to initialize name to given value and test scores to 0
	 * @param a - name of student
	 */
	public Student2(String a) {
		name = a;
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores.add(0);
		}
	}
	
	/**
	 * Constructor to initialize name to given value and test scores to given values
	 * @param a - name of student
	 * @param nums - test scores of student
	 */
	public Student2(String a, ArrayList<Integer> nums) {
		name = a;
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores.add(nums.get(i));
		}
	}
	
	/**
	 * Constructor to initialize Student to given Student
	 * @param other - other Student
	 */
	public Student2(Student other) {
		name = other.getName();
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores.add(other.getScore(i));
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
		if (test > 3) test = 3;
		testScores.set(test-1, score);
	}
	
	/**
	 * Sets the test scores of the student
	 * @param scores - array of scores to set
	 */
	public void setScore(ArrayList<Integer> scores) {
		for (int i = 0; i < NUM_TESTS; i++) {
			testScores.set(i, scores.get(i));
		}
	}
	
	/**
	 * Get the test score of the student
	 * @param test - index of test score to get
	 * @return testScores[test] - the test score requested
	 */
	public int getScore(int test) {
		if (test > 3) test = 3;
		return testScores.get(test-1);
	}
	
	/**
	 * Get the average test score
	 * @return avg - avg test score
	 */
	public int getAverage() {
		int avg = 0;
		for (int i = 0; i < NUM_TESTS; i++) avg += testScores.get(i);
		avg /= NUM_TESTS;
		return avg;
	}
	
	/**
	 * Get the highest test score
	 * @return max - highest score
	 */
	public int getHighScore() {
		int max = 0;
		for (int i = 0; i < NUM_TESTS; i++) max = Math.max(max, testScores.get(i));
		return max;
	}
	
	/**
	 * Get the data of the Student in string form
	 * @return data in string form
	 */
	public String toString() {
		String s = "Name: " + name + ": ";
		for (int i = 0; i < NUM_TESTS; i++) {
			s += "test " + (i+1) + ": " + testScores.get(i) + " ";
		}
		s += "Average: " + getAverage() + " High score: " + getHighScore();
		return s;
	}
	
}
