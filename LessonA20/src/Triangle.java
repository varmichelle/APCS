/**
 * 
 * Class Triangle - represents a Triangle
 * @author Michelle Li
 * Period 1
 *
 */

public class Triangle implements Measurable {
	
	private double side1, side2, side3;
	
	/**
	 * Constructor to initialize dimensions of triangle
	 * @param s1 - side length 1
	 * @param s2 - side length 2
	 * @param s3 - side length 3
	 */
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	/**
	 * Set side 1
	 * @param s - side1
	 */
	public void setSide1(double s) {
		side1 = s;
	}
	
	/**
	 * Set side 2
	 * @param s - side2
	 */
	public void setSide2(double s) {
		side2 = s;
	}
	
	/**
	 * Set side 3
	 * @param s - side3
	 */
	public void setSide3(double s) {
		side3 = s;
	}
	
	/**
	 * Get side 1
	 * @return side1
	 */
	public double getSide1() {
		return side1;
	}
	
	/**
	 * Get side 2
	 * @return side2
	 */
	public double getSide2() {
		return side2;
	}
	
	/**
	 * Get side 3
	 * @return side3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * Get perimeter
	 * @return perimeter
	 */
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/**
	 * Get area
	 * @return area
	 */
	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	
	/**
	 * Return data in string format
	 * @return data
	 */
	@Override
	public String toString() {
		String s = "Triangle:\n";
		s += "\tside1 = " + getSide1() + "\n";
		s += "\tside2 = " + getSide2() + "\n";
		s += "\tside3 = " + getSide3() + "\n";
		s += "\tperimeter = " + getPerimeter() + "\n";
		s += "\tarea = " + getArea() + "\n";
		return s;
	}

}
