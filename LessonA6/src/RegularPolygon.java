/**
 *  
 * class RegularPolygon - class to model any regular polygon
 * @author Michelle Li
 * Period 1
 *
 */
public class RegularPolygon {

	// INSTANCE VARIABLES
	// number of sides
	private int mySides;
	// side length
	private double mySideLength;
	// radius of circumscribed circle
	private double myR;
	// radius of inscribed circle
	private double myr;
	
	/**
	 * Default constructor to initialize the polygon to a triangle
	 * sides = 3
	 */
	public RegularPolygon() {
		mySides = 3;
		mySideLength = 0;
	}
	
	/**
	 * Constructor to set mySides and mySideLength
	 * @param numSides: number of sides of the polygon
	 * @param sideLength: length of each side of the polygon
	 */
	public RegularPolygon(int numSides, double sideLength) {
		mySides = numSides;
		mySideLength = sideLength;
	}
	
	/**
	 * Method to calculate the vertex angle of the polygon
	 * @return angle - degree measure of each vertex angle
	 */
	public double vertexAngle() {
		double angle = (mySides - 2.0) * 180.0 / mySides;
		return angle;
	}
	
	/**
	 * Method to calculate the perimeter of the polygon
	 * @return perimeter
	 */
	public double Perimeter() {
		double perimeter = mySides * mySideLength;
		return perimeter;
	}
	
	/**
	 * Method to calculate the radius of the inscribed circle 
	 * Sets instance variable myr to the value of the radius
	 */
	private void calcr() {
		myr = 0.5 * mySideLength / Math.tan(Math.PI / mySides);
	}
	
	/**
	 * Method to calculate the radius of the circumscribed circle
	 * Sets instance variable myR to the value of the radius
	 */
	private void calcR() {
		myR = 0.5 * mySideLength / Math.sin(Math.PI / mySides);
	}
	
	/**
	 * Method to calculate area of the polygon
	 * @return area
	 */
	public double Area() {
		double area = 0.5 * mySides * myR * myR * Math.sin(2 * Math.PI / mySides);
		return area;
	}
	
	/**
	 * Getter method to get number of sides
	 * @return mySides
	 */
	public int getNumside() {
		return mySides;
	}
	
	/**
	 * Getter method to get side length
	 * @return mySideLength
	 */
	public double getSideLength() {
		return mySideLength;
	}
	
	/**
	 * Getter method to get circumradius
	 * @return myR
	 */
	public double getR() {
		calcR();
		return myR;
	}
	
	/** 
	 * Getter method to get inradius
	 * @return myr
	 */
	public double getr() {
		calcr();
		return myr;
	}

}
