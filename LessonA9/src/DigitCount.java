import java.util.Random;
public class DigitCount {
	
	private Random rand;

	public DigitCount(int seed) {
		rand = new Random(seed);
	}
	
	public int generateNewNumber(int max) {
		return rand.nextInt(max);
	}
	
	public int countDigits(int num) {
		if (num == 0) return 0;
		else return 1 + countDigits(num/10);
	}

}
