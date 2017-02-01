/**
 * Class School to store students
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class School2 {

	// instance variable
	private ArrayList<Student2> students = new ArrayList<Student2>();
	
	/**
	 * Add a given student
	 * @param newStudent - student to add
	 */
	public void add(Student2 newStudent) {
		students.add(newStudent);
	}
	
	/**
	 * Add a new student given name and test scores
	 * @param name - name of student
	 * @param tests - test scores of student
	 */
	public void add(String name, ArrayList<Integer> tests) {
		students.add(new Student2(name, tests));
	}
	
	/**
	 * Add a new student given name
	 * @param name - name of student
	 */
	public void add(String name) {
		students.add(new Student2(name));
	}
	
	/**
	 * Add a new student (blank)
	 */
	public void add() {
		students.add(new Student2());
	}
	
	/**
	 * Remove a student given the student to remove
	 * @param s - student to remove
	 */
	public void remove(Student2 s) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) == s) {
				students.remove(i);
				break;
			}
		}
	}
	
	/**
	 * Remove a student located at a given index
	 * @param index - index of student to remove
	 */
	public void remove(int index) {
		students.remove(index);
	}
	
	/**
	 * Remove a student with a given name
	 * @param name - name of student
	 */
	public void remove(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				students.remove(i);
				break;
			}
		}
	}
	
	/**
	 * Replace a student at given index with newStudent
	 * @param index - index of student to replace
	 * @param newStudent - replacement student
	 */
	public void replace(int index, Student2 newStudent) {
		students.set(index, newStudent);
	}
	
	/**
	 * Get the student that achieved the highest score 
	 * @return bestStudent - student that achieved the highest score
	 */
	public Student2 getHighScore() {
		int max = 0;
		Student2 bestStudent = new Student2();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getHighScore() > max) {
				max = students.get(i).getHighScore();
				bestStudent = students.get(i);
			}
		}
		return bestStudent;
	}
	
	/**
	 * Get the class average test score
	 * @return avg - class average
	 */
	public int getClassAverage() {
		int avg = 0;
		for (int i = 0; i < students.size(); i++) {
			avg += students.get(i).getAverage();
		}
		avg /= students.size();
		return avg;
	}
	
	/**
	 * Get the student at given index
	 * @param index - index of student
	 * @return the student located at that index
	 */
	public Student2 getStudent(int index) {
		if (index >= students.size()) return null;
		return students.get(index);
	}
	
	/**
	 * Get student with a given name
	 * @param name - name of student 
	 * @return student with the given name
	 */
	public Student2 getStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) return students.get(i);
		}
		return null;
	}
	
	/**
	 * Return data of School in string form
	 * @return data in String form
	 */
	public String toString() {
		String s = "";
		for (int i = 0; i < students.size(); i++) {
			s += students.get(i).toString() + "\n";
		}
		s += "Class average: " + getClassAverage() + "\n";
		s += "Highest score\n";
		s += getHighScore() + "\n";
		return s;
	}
	
}
