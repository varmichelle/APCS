/**
 * Class School to store students
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class School {

	private final int MAX_STUDENTS = 10;
	private Student[] students = new Student[MAX_STUDENTS];
	private int numStudents = 0;
	
	public void add(Student newStudent) {
		students[numStudents] = newStudent;
		numStudents++;
	}
	
	public void add(String name, int[] tests) {
		students[numStudents] = new Student(name, tests);
		numStudents++;
	}
	
	public void add(String name) {
		students[numStudents] = new Student(name);
		numStudents++;
	}
	
	public void add() {
		students[numStudents] = new Student();
		numStudents++;
	}
	
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
	
	public void remove(int index) {
		for (int i = index + 1; i < numStudents; i++) {
			students[i-1] = students[i];
		}
		students[numStudents - 1] = new Student();
	}
	
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
	
	public void replace(int index, Student newStudent) {
		students[index] = newStudent;
	}
	
	public Student getHighScore() {
		int max = 0;
		Student bestStudent = new Student();
		for (int i = 0; i < numStudents; i++) {
			if (students[i].getHighScore() > max) bestStudent = students[i];
		}
		return bestStudent;
	}
	
	public int getClassAverage() {
		int avg = 0;
		for (int i = 0; i < numStudents; i++) {
			avg += students[i].getAverage();
		}
		avg /= numStudents;
		return avg;
	}
	
	public Student getStudent(int index) {
		return students[index];
	}
	
	public Student getStudent(String name) {
		for (int i = 0; i < numStudents; i++) {
			if (students[i].getName().equals(name)) return students[i];
		}
		return new Student();
	}
	
	public String toString() {
		return "";
	}
	
}
