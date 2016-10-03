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

	/**
	 * Private method round() to round r, g, b values
	 * @param a - double to round
	 * @return rounded value
	 */
	private int round(double a) {
		if (a >= 255) return 255;
		double floor = (int) a;
		if (floor == a) return (int) floor;
		else return (int) floor + 1;
	}
	
	/**
	 * Method calculateHue() to calculate the hue value given R, G, B
	 * @return hue
	 */
	private int calculateHue() {
		double rPrime = red / 255.0;
		double gPrime = green / 255.0;
		double bPrime = blue / 255.0;
		double cmax = getMaximum(rPrime, gPrime, bPrime);
		double cmin = getMinimum(rPrime, gPrime, bPrime);
		double delta = cmax - cmin;
		if (delta == 0) return 0;
		int hue = 0;
		if (cmax == rPrime) hue = 60 * (int) (((gPrime - bPrime)/delta) % 6);
		if (cmax == gPrime) hue = 60 * (int) ((bPrime - rPrime)/delta + 2);
		if (cmax == bPrime) hue = 60 * (int) ((rPrime - gPrime)/delta + 4);
		return hue;
	}

	/**
	 * Method calculateSaturation() to calculate saturation value given R, G, B
	 * @return saturation
	 */
	private int calculateSaturation() {
		double rPrime = red / 255.0;
		double gPrime = green / 255.0;
		double bPrime = blue / 255.0;
		double cmax = getMaximum(rPrime, gPrime, bPrime);
		double cmin = getMinimum(rPrime, gPrime, bPrime);
		double delta = cmax - cmin;
		int saturation = 0;
		if (cmax == 0) saturation = 0;
		else saturation = (int) (100 * delta / cmax);	
		return saturation;
	}

	/**
	 * Method calculateBrightness() to calculate brightness value given R, G, B
	 * @return brightness
	 */
	private int calculateBrightness() {
		double rPrime = red / 255.0;
		double gPrime = green / 255.0;
		double bPrime = blue / 255.0;
		double cmax = getMaximum(rPrime, gPrime, bPrime);
		int brightness = (int) (cmax * 100);
		return brightness;
	}

	/**
	 * Method RBGtoHSV() to set hue, saturation, brightness values
	 */
	public void RGBtoHSV() {
		hue = calculateHue();
		saturation = calculateSaturation();
		brightness = calculateBrightness();
	}

	/**
	 * Method HSVtoRGB to set R, G, B values
	 */
	public void HSVtoRGB() {
		double s = saturation / 100.0;
		double v = brightness / 100.0;
		double C = s * v;
		double X = C * (1 - (Math.abs(((double) hue / 60)%2 - 1)));
		double m = v - C;
		double rPrime = 0, gPrime = 0, bPrime = 0;
		if (hue < 60) {
			rPrime = C;
			gPrime = X;
			bPrime = 0;
		} else if (hue < 120) {
			rPrime = X;
			gPrime = C;
			bPrime = 0;
		} else if (hue < 180) {
			rPrime = 0;
			gPrime = C;
			bPrime = X;
		} else if (hue < 240) {
			rPrime = 0;
			gPrime = X;
			bPrime = C;
		} else if (hue < 300) {
			rPrime = X;
			gPrime = 0;
			bPrime = C;
		} else if (hue < 360) {
			rPrime = C;
			gPrime = 0;
			bPrime = X;
		}
		red = round((rPrime + m) * 255);
		green = round((gPrime + m) * 255);
		blue = round((bPrime + m) * 255);
	}
	
	/**
	 * Method printRBGtoHSV() to print the RBG to HSV values as a string
	 */
	public void printRGBtoHSV() {
		char c = 176;
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (", red, ", ", green, ", ", blue, ")");
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (", hue, ("" + c + ", "), (saturation), "%, ", (brightness),
				"%)\n");
	}

	/**
	 * Method printHSVtoRGB() to print the HSV to RGB values as a string
	 */
	public void printHSVtoRGB() {
		char c = 176;
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (", hue, ("" + c + ", "), (saturation), "%, ", (brightness),
				"%)");
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (", red, ", ", green, ", ", blue, ")\n");
	}

}
