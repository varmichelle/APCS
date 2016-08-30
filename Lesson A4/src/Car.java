/**
 * @author Michelle Li
 * Period 1
 * 
 */
public class Car {

	private int startOdometer, currentOdometer;
	private double gallonsConsumed;
	
	public Car(int a) {
		startOdometer = a;
	}
	
	public void fillUp(int current, double gallons) {
		currentOdometer = current;
		gallonsConsumed = gallons;
	}
	
	public double calculateMPG() {
		double MPG = (currentOdometer - startOdometer) / gallonsConsumed;
		return MPG;
	}
	
	public void resetMPG() {
		gallonsConsumed = 0;
		startOdometer = currentOdometer;
	}

}
