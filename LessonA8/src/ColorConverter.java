/**
 * Class ColorConvertor to convert between RGB, HSV
 * 
 * @author Michelle Li
 * Period 1
 *
 */
public class ColorConverter {

	private int red, green, blue, hue, saturation, brightness;

	/**
	 * Constructor ColorConverter to initialize RBG or HSV values
	 * @param type
	 * @param value1
	 * @param value2
	 * @param value3
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

}
