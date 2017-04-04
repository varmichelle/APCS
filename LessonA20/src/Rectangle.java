/**
 * 
 * Class Rectangle - represents a rectangle
 * @author Michelle Li
 * Period 1
 *
 */

public class Rectangle implements Measurable {

	private double length, width;
	
	/**
	 * Constructor to initialize dimensions of rectangle
	 * @param l - length
	 * @param w - width
	 */
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	/**
	 * Set length of rectangle
	 * @param l - length
	 */
	public void setLength(double l) {
		length = l;
	}
	
	/**
	 * Set width of rectangle
	 * @param w - width
	 */
	public void setWidth(double w) {
		width = w;
	}
	
	/**
	 * Get length of rectangle
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Get width of rectangle
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Get perimeter of rectangle
	 * @return perimeter
	 */
	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	/**
	 * Get area of rectangle 
	 * @return area
	 */
	@Override
	public double getArea() {
		return length * width;
	}
	
	/**
	 * Return data in string format
	 * @return data
	 */
	@Override
	public String toString() {
		String s = "Rectangle:\n";
		s += "\tlength = " + getLength() + "\n";
		s += "\twidth = " + getWidth() + "\n";
		s += "\tperimeter = " + getPerimeter() + "\n";
		s += "\tarea = " + getArea() + "\n";
		return s;
	}

}
