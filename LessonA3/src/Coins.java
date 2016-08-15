/**
 * 
 * @author Michelle Li
 * period 1
 * 
 */

public class Coins {
	// declare a private instance variable called cents
	/**
	 * constructor to initialize the instance variables
	 * @param money - amount for which the change is to be computed
	 */
	private int cents;
	public Coins(int money) {
		// initialize cent
		cents = money;		
		System.out.println(cents + " cents =>");
	}
	/**
	 * method to calculate the change
	 * @param money the amount for which the change is 
	 * 			to be computed
	 */
	public void change() {
		// compute quarters
		int quarters = cents / 25;
		System.out.println("Quarter(s) " + quarters);
		cents -= quarters * 25;
		// compute dimes
		int dimes = cents / 10;
		System.out.println("Dime(s) " + dimes);
		cents -= dimes * 10;
		// compute nickels
		int nickels = cents / 5;
		System.out.println("Nickel(s) " + nickels);
		cents -= nickels * 5;
		// compute pennies
		int pennies = cents;
		System.out.println("Penny(s) " + pennies);
		cents -= pennies;
	}

}
