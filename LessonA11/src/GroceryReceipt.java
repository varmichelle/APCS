/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class GroceryReceipt {

	private Employee clerk;
	private String receipt;
	private double total;
	
	/**
	 * Constructor to initialize instance variables
	 * @param clerk - employee
	 */
	public GroceryReceipt(Employee clerk) {
		this.clerk = clerk;
		receipt = "";
		total = 0;
	}
	
	/**
	 * Getter method for Clerk
	 * @return clerk
	 */
	public Employee getClerk() {
		return clerk;
	}
	
	/**
	 * Getter method for receipt
	 * @return receipt
	 */
	public String getReceipt() {
		return receipt;
	}
	
	/**
	 * Getter method for total
	 * @return total
	 */
	public double getTotal() {
		return total;
	}
	
	/**
	 * Add item to cart, updates receipt and total price
	 * @param item - item to be added
	 */
	public void add(Item item) {
		receipt += item;
		total += item.getPrice();
	}
	
	/**
	 * Method valueToString to convert input double into String with 2 decimal places
	 * @param number - number to be converted into String
	 * @return number converted into String
	 */
	public String valueToString(double number) {
		String s = "" + Math.round(number*100)/100.0;
		if (s.length() - s.indexOf(".") < 3) s+= "0";
		if (s.length() - s.indexOf(".") < 3) s+= "0";
		return s;
	}
	
	/**
	 * Method toString to return data in string format
	 * @return data in string format
	 */
	public String toString() {
		return receipt + "\nTotal: $" + total;
	}
	
}
