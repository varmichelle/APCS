/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class Teacher extends Person {

	private String subject;
	private double salary;
	
	/**
	 * Constructor to initialize name, age, gender, subject, salary
	 * @param name - name of teacher
	 * @param age - age of teacher
	 * @param gender - gender of teacher
	 * @param subject - subject the teacher teaches
	 * @param salary - salary of the teacher
	 */
	public Teacher(String name, int age, String gender, String subject, double salary) {
		super(name, age, gender);
		this.subject = subject;
		this.salary = salary;
	}
	
	/**
	 * Method getSubject() to return teacher's subject
	 * @return subject
	 */
	public String getSubject() {
		return subject;
	}
	
	/**
	 * Method setSubject() to set teacher's subject
	 * @param newSubject - new subject
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}
	
	/**
	 * Method getSalary() to return teacher's salary
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Method setSalary() to set teacher's salary
	 * @param newSalary - new salary
	 */
	public void setSalary(double newSalary) {
		salary = newSalary;
	}
	
	/**
	 * Method toString() to return info in string format
	 * @return string formatted data
	 */
	public String toString() {
		return super.toString() + ", subject: " + subject + ", salary: " + salary;
	}

}
