/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class CollegeStudent extends Student {

	private String major;
	private int year;
	
	/**
	 * Constructor to initialize instance variables
	 * @param name - name of college student
	 * @param age - age of college student
	 * @param gender - gender of college student
	 * @param id - id of college student
	 * @param gpa - gpa of college student
	 * @param year - graduation year of college student
	 * @param major
	 */
	public CollegeStudent(String name, int age, String gender, String id, double gpa, int year, String major) {
		super(name, age, gender, id, gpa);
		this.major = major;
		this.year = year;
	}

	/**
	 * Method getMajor() to return student's major
	 * @return major
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * Method setMajor() to set student's major
	 * @param newMajor - new major
	 */
	public void setMajor(String newMajor) {
		major = newMajor;
	}
	
	/**
	 * Method getYear() to return student's grad year
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Method setYear() to set student's year
	 * @param newYear - new year
	 */
	public void setYear(int newYear) {
		year = newYear;
	}
	
	/**
	 * Method toString() to output data in string format
	 * @return data in string format
	 */
	public String toString() {
		return super.toString() + ", year: " + year + ", major: " + major;
	}

}
