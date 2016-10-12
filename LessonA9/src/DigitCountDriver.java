
public class DigitCountDriver {

	public static void main(String[] args) {
		
		DigitCount dc = new DigitCount(7);
		int randNum = dc.generateNewNumber(100);
		int digits = dc.countDigits(randNum);
		System.out.println("Number " + randNum + " has " + digits + " digits");
		
		DigitCount dc1 = new DigitCount(8);
		randNum = dc1.generateNewNumber(100000);
		digits = dc1.countDigits(randNum);
		System.out.println("Number " + randNum + " has " + digits + " digits");
		
		randNum = dc.generateNewNumber(10000000);
		digits = dc.countDigits(randNum);
		System.out.println("Number " + randNum + " has " + digits + " digits");
				
	}

}
