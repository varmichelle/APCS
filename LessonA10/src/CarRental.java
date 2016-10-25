
public class CarRental {

	private String make, model, licensePlate, code;
	
	public CarRental(String make, String model, String licensePlate) {
		this.make = make;
		this.model = model;
		this.licensePlate = licensePlate;
	}
	
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

	public String getCode() {
		return code;
	}
	
	public String toString() {
		String s = "Make = " + make + "\n";
		s += "Model = " + model + "\n";
		s += licensePlate + " = " + code;
		return s;
	}
	
}
