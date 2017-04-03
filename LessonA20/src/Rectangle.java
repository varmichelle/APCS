/**
 * 
 * Class Rectangle - represents a rectangle
 * @author Michelle Li
 * Period 1
 *
 */

public class Rectangle implements Measurable {

	private double length, width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public double getArea() {
		return length * width;
	}
	
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
