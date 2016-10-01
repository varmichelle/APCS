/**
 * Class ColorConvertor to convert between RGB, HSV
 * 
 * @author Michelle Li Period 1
 *
 */
public class ColorConverter {

	private int red, green, blue, hue, saturation, brightness;

	/**
	 * Constructor ColorConverter to initialize RBG or HSV values
	 * 
	 * @param type - 1 indicates RGB, 2 indicates HSV
	 * @param value1 - either red or hue depending on type
	 * @param value2 - either green or saturation depending on type
	 * @param value3 - either blue or brightness depending on type
	 */
	public ColorConverter(int type, int value1, int value2, int value3) {
		if (type == 1) {
			red = value1;
			green = value2;
			blue = value3;
		} else if (type == 2) {
			hue = value1;
			saturation = value2;
			brightness = value3;
		}
	}

	/**
	 * Method setRGB to set the RGB values (red, green, blue)
	 * 
	 * @param r - red value
	 * @param g - green value
	 * @param b - blue value
	 */
	public void setRGB(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	/**
	 * Method setHSV to set the HSV values (hue, saturation, brightness)
	 * 
	 * @param h - hue value
	 * @param s - saturation value
	 * @param v - brightness value
	 */
	public void setHSV(int h, int s, int v) {
		hue = h;
		saturation = s;
		brightness = v;
	}

	/**
	 * Method getMaximum to find the max of 3 numbers
	 * 
	 * @param a - first number
	 * @param b - second number
	 * @param c - third number
	 * @return maximum of 3 numbers
	 */
	private double getMaximum(double a, double b, double c) {
		if (a > b) {
			if (a > c) return a;
			else return c;
		} else {
			if (b > c) return b;
			else return c;
		}
	}

	/**
	 * Method getMinimum to find the min of 3 numbers
	 * 
	 * @param a - first number
	 * @param b - second number
	 * @param c - third number
	 * @return minimum of 3 numbers
	 */
	private double getMinimum(double a, double b, double c) {
		if (a < b) {
			if (a < c) return a;
			else return c;
		} else {
			if (b < c) return b;
			else return c;
		}
	}

	private int calculateHue() {
		double rPrime = red / 255.0;
		double gPrime = green / 255.0;
		double bPrime = blue / 255.0;
		double cmax = getMaximum(rPrime, gPrime, bPrime);
		double cmin = getMinimum(rPrime, gPrime, bPrime);
		double delta = cmax - cmin;
		if (delta == 0) return 0;
		if (cmax == rPrime) {
			
		}
	}

	private int calculateSaturation() {

	}

	private int calculateBrightness() {

	}

	public void RGBtoHSV() {
		hue = calculateHue();
		saturation = calculateSaturation();
		brightness = calculateBrightness();
	}

	public void HSVtoRGB() {
		
	}

	public void printRGBtoHSV() {
		char c = 176;
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (", red, ", ", green, ", ", blue, ")");
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (", hue, ("" + c + ", "), saturation, "%, ", brightness,
				"%)\n");
	}

	public void printHSVtoRGB() {
		char c = 176;
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (", hue, ("" + c + ", "), saturation, "%, ", brightness,
				"%)");
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (", red, ", ", green, ", ", blue, ")\n");
	}

}
