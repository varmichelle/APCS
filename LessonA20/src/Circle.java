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
	
	public Circle(double r) {
		radius = r;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		String s = "Circle:\n";
		s += "\tradius = " + getRadius() + "\n";
		s += "\tcircumference = " + getPerimeter() + "\n";
		s += "\tarea = " + getArea() + "\n";
		return s;
	}
	
}
