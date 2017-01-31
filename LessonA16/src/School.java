/**
 * Class School to store students
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class School {

	// instance variables
	private final int MAX_STUDENTS = 10;
	private Student[] students = new Student[MAX_STUDENTS];
	private int numStudents = 0;
	
	/**
	 * Add a given student
	 * @param newStudent - student to add
	 */
	public void add(Student newStudent) {
		students[numStudents] = newStudent;
		numStudents++;
	}
	
	/**
	 * Add a new student given name and test scores
	 * @param name - name of student
	 * @param tests - test scores of student
	 */
	public void add(String name, int[] tests) {
		students[numStudents] = new Student(name, tests);
		numStudents++;
	}
	
	/**
	 * Add a new student given name
	 * @param name - name of student
	 */
	public void add(String name) {
		students[numStudents] = new Student(name);
		numStudents++;
	}
	
	/**
	 * Add a new student (blank)
	 */
	public void add() {
		students[numStudents] = new Student();
		numStudents++;
	}
	
	/**
	 * Remove a student given the student to remove
	 * @param s - student to remove
	 */
	public void remove(Student s) {
		for (int i = 0; i < numStudents; i++) {
			if (students[i] == s) {
				for (int j = i+1; j < numStudents; j++) {
					students[j-1] = students[j];
				}
				students[numStudents - 1] = new Student();
			}
		}
	}
	
	/**
	 * Remove a student located at a given index
	 * @param index - index of student to remove
	 */
	public void remove(int index) {
		for (int i = index + 1; i < numStudents; i++) {
			students[i-1] = students[i];
		}
		students[numStudents - 1] = new Student();
	}
	
	/**
	 * Remove a student with a given name
	 * @param name - name of student
	 */
	public void remove(String name) {
		for (int i = 0; i < numStudents; i++) {
			if (students[i].getName().equals(name)) {
				for (int j = i+1; j < numStudents; j++) {
					students[j-1] = students[j];
				}
				students[numStudents - 1] = new Student();
			}
		}
	}
	
	/**
	 * Replace a student at given index with newStudent
	 * @param index - index of student to replace
	 * @param newStudent - replacement student
	 */
	public void replace(int index, Student newStudent) {
		students[index] = newStudent;
	}
	
	/**
	 * Get the student that achieved the highest score 
	 * @return bestStudent - student that achieved the highest score
	 */
	public Student getHighScore() {
		int max = 0;
		Student bestStudent = new Student();
		for (int i = 0; i < numStudents; i++) {
			if (students[i].getHighScore() > max) bestStudent = students[i];
		}
		return bestStudent;
	}
	
	/**
	 * Get the class average test score
	 * @return avg - class average
	 */
	public int getClassAverage() {
		int avg = 0;
		for (int i = 0; i < numStudents; i++) {
			avg += students[i].getAverage();
		}
		avg /= numStudents;
		return avg;
	}
	
	/**
	 * Get the student at given index
	 * @param index - index of student
	 * @return the student located at that index
	 */
	public Student getStudent(int index) {
		return students[index];
	}
	
	/**
	 * Get student with a given name
	 * @param name - name of student 
	 * @return student with the given name
	 */
	public Student getStudent(String name) {
		for (int i = 0; i < numStudents; i++) {
			if (students[i].getName().equals(name)) return students[i];
		}
		return new Student();
	}
	
	/**
	 * Return data of School in string form
	 * @return data in String form
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < numStudents; i++) {
			s += students[i].toString() + "\n";
		}
		s += "Class average: " + getClassAverage() + "\n";
		s += "Highest score\n";
		s += getHighScore() + "\n";
		return s;
	}
	
}
