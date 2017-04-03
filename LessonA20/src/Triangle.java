/**
 * 
 * Class Triangle - represents a Triangle
 * @author Michelle Li
 * Period 1
 *
 */

public class Triangle implements Measurable {
	
	private double side1, side2, side3;
	
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public void setSide1(double s) {
		side1 = s;
	}
	
	public void setSide2(double s) {
		side2 = s;
	}
	
	public void setSide3(double s) {
		side3 = s;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	@Override
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
	}
	
	@Override
	public String toString() {
		return "";
	}

}
