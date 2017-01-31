/**
 * Class School to store students
 * @author Michelle Li
 * @period 1
 *
 */

import java.util.*;

public class School2 {

	private final int MAX_STUDENTS = 10;
	private ArrayList<Student2> students = new ArrayList<Student2>();
	
	public void add(Student2 newStudent) {
		students.add(newStudent);
	}
	
	public void add(String name, ArrayList<Integer> tests) {
		students.add(new Student2(name, tests));
	}
	
	public void add(String name) {
		students.add(new Student2(name));
	}
	
	public void add() {
		students.add(new Student2());
	}
	
	public void remove(Student2 s) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i) == s) {
				for (int j = i+1; j < students.size(); j++) {
					students.set(j-1, students.get(j));
				}
			}
		}
	}
	
	public void remove(int index) {
		for (int i = index + 1; i < students.size(); i++) {
			students.set(i-1, students.get(i));
		}
	}
	
	public void remove(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) {
				for (int j = i+1; j < students.size(); j++) {
					students.set(j-1, students.get(j));
				}
				students.set(students.size()-1, new Student2());
			}
		}
	}
	
	public void replace(int index, Student2 newStudent) {
		students.set(index, newStudent);
	}
	
	public Student2 getHighScore() {
		int max = 0;
		Student2 bestStudent = new Student2();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getHighScore() > max) bestStudent = students.get(i);
		}
		return bestStudent;
	}
	
	public int getClassAverage() {
		int avg = 0;
		for (int i = 0; i < students.size(); i++) {
			avg += students.get(i).getAverage();
		}
		avg /= students.size();
		return avg;
	}
	
	public Student2 getStudent(int index) {
		return students.get(index);
	}
	
	public Student2 getStudent(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name)) return students.get(i);
		}
		return new Student2();
	}
	
	public String toString() {
		return "";
	}
	
}
