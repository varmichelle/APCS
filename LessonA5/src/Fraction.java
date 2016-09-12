/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

// class Fraction
public class Fraction {

	// instance variables to store the numerator and denominator of the fraction
	private int numerator, denominator;
	
	// constructor that takes no paramaters and defaults to 0
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	// constructor that initializes the fraction to the parameter value
	public Fraction(int n) {
		numerator = n;
		denominator = 1;
	}
	
	// constructor that initializes the numerator and denominator of fraction to the parameters
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
                this.reduce();
	}
	
	// constructor that initializes the fraction to a given fraction
	public Fraction(Fraction other) {
		numerator = other.numerator;
		denominator = other.denominator;
	}
	
	// returns numerator
	public int getNumerator() {
		return numerator;
	}
	
	// returns denominator
	public int getDenominator() {
		return denominator;
	}
	
	// returns value of fraction
	public double getValue() {
		return numerator / (double) denominator;
	}
	
	// set the numerator of the fraction to the parameter value
	public void setNumerator(int n) {
		numerator = n;
	}
	
	// set the denominator of the fraction to the parameter value
	public void setDenominator(int d) {
		denominator = d;
	}
	
	// set the fraction to the parameter 
	public void setFraction(Fraction other) {
		numerator = other.numerator;
		denominator = other.denominator;
	}
	
	// add a fraction object to the fraction
	public Fraction add(Fraction other) {
		Fraction f = new Fraction();
		f.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
		f.denominator = this.denominator * other.denominator;
                f.reduce();
		return f;
	}
	
	// add an integer to the fraction
	public Fraction add(int m) {
		Fraction f = new Fraction();
		f.numerator = this.numerator + this.denominator * m;
		f.denominator = this.denominator;
                f.reduce();
		return f;
	}
	
	// multiply the current fraction by another fraction
	public Fraction multiply(Fraction other) {
		Fraction f = new Fraction();
		f.numerator = this.numerator * other.numerator;
		f.denominator = this.denominator * other.denominator;
                f.reduce();
		return f;
	}
	
	// multiply the fraction by an integer	
	public Fraction multiply(int m) {
		Fraction f = new Fraction();
		f.numerator = this.numerator * m;
		f.denominator = this.denominator;
                f.reduce();
		return f;
	}
	
	// reduce the fraction using Java gcf methods
	public void reduce() {
		// make sure denominator is positive
		if (denominator < 0) {
			numerator *= -1;
			denominator *= -1;
		}
		// use MyMathLib for gcf
		int gcf = MyMathLib.gcf(Math.abs(numerator), Math.abs(denominator));
		numerator /= gcf;
		denominator /= gcf;
	}
	
	// return the fraction in string format
	public String toString() {
                this.reduce();
		return numerator + "/" + denominator;
	}
}
