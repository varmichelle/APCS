/**
 * 
 * Class Circle - represents a circle
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class Circle implements Measurable {

	private double radius;
	
	/**
	 * Constructor to initialize radius
	 * @param r - radius
	 */
	public Circle(double r) {
		radius = r;
	}
	
	/**
	 * Set radius of circle
	 * @param r - radius
	 */
	public void setRadius(double r) {
		radius = r;
	}
	
	/**
	 * Get radius of circle
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Get circumference of circle
	 */
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	/**
	 * Get area of circle
	 */
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * Return data in string format
	 * @return data
	 */
	@Override
	public String toString() {
		String s = "Circle:\n";
		s += "\tradius = " + getRadius() + "\n";
		s += "\tcircumference = " + getPerimeter() + "\n";
		s += "\tarea = " + getArea() + "\n";
		return s;
	}
	
}
