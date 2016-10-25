/**
 * 
 * @author Michelle Li
 * Period 1
 * Class CarRental - make, model, license plate, and rental code of a rental car
 *
 */

public class CarRental {

	private String make, model, licensePlate, code;
	
	/**
	 * Constructor to initialize make, model, and licensePlate
	 * @param make - make of the rental car in string form
	 * @param model - model of the rental car in strong form
	 * @param licensePlate - license plate of the rental car in string form
	 */
	
	public CarRental(String make, String model, String licensePlate) {
		this.make = make;
		this.model = model;
		this.licensePlate = licensePlate;
	}
	
	/**
	 * Method computeCode to determine the car's rental code
	 * Sets instance variable code to what is computed
	 */
	
	public void computeCode() {
		int firstLetter = (int) licensePlate.charAt(0);
		int secondLetter = (int) licensePlate.charAt(1);
		int thirdLetter = (int) licensePlate.charAt(2);
		int firstNumber = (int) licensePlate.charAt(4) - '0';
		int secondNumber = (int) licensePlate.charAt(5) - '0';
		int thirdNumber = (int) licensePlate.charAt(6) - '0';
		int numbers = firstNumber * 100 + secondNumber * 10 + thirdNumber + firstLetter + secondLetter + thirdLetter;
		char letter = (char) (numbers % 26 + 'A');
		code = letter + ("" + numbers);
	}

	/**
	 * Method getCode
	 * @return code (rental code)
	 */
	
	public String getCode() {
		return code;
	}
	
	/**
	 * Method toString
	 * @return string form of the data (make, model, license plate, code)
	 */
	
	public String toString() {
		String s = "Make = " + make + "\n";
		s += "Model = " + model + "\n";
		s += licensePlate + " = " + code;
		return s;
	}
	
}
