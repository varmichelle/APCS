/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class Item {
	
	private String name;
	private double price, discount;
	
	/**
	 * Constructor to initialize instance variables
	 * @param name - name of the item
	 * @param price - price of the item 
	 * @param discount - discount of the item
	 */
	public Item(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	/**
	 * Getter method for name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Setter method for name
	 * @param name - new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Setter method for price
	 * @param price - new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Getter method for discount
	 * @return discount
	 */
	public double getDiscount() {
		return discount;
	}
	
	/**
	 * Setter method for discount
	 * @param discount - new discount
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
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
		return name + " $" + price + " (-$" + discount + ")\n";
	}
	
}
