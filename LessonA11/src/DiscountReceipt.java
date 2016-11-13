/**
 * 
 * @author Michelle Li
 * Period 1
 *
 */

public class DiscountReceipt extends GroceryReceipt {

	private boolean preferred;
	private int discountCount;
	private double discountAmount;
	
	/**
	 * Constructor to initialize instance variables
	 * @param clerk - employee
	 * @param preferred - if the receipt is for a preferred customer
	 */
	public DiscountReceipt(Employee clerk, boolean preferred) {
		super(clerk);
		this.preferred = preferred;
		this.discountCount = 0;
		this.discountAmount = 0;
	}
	
	/**
	 * Getter method for discount count
	 * @return discountCount
	 */
	public int getDiscountCount() {
		return discountCount;
	}
	
	/**
	 * Getter method for discount amount 
	 * @return discountAmount
	 */
	public double getDiscountAmount() {
		return discountAmount;
	}
	
	/**
	 * Method add to add item to purchase
	 */
	public void add(Item item) {
		if (preferred && item.getDiscount() != 0) {
			discountCount++;
			discountAmount += item.getDiscount();
		}
		super.add(item);
	}
	
	/**
	 * Method getTotal to return total after discount
	 * @return total after discount
	 */
	public double getTotal() {
		return super.getTotal() - discountAmount;
	}
	
	/**
	 * Method getDiscountPercent to return discount percentage
	 * @return discount percentage
	 */
	public double getDiscountPercent() {
		return 100 * (discountAmount / super.getTotal());
	}
	
	/**
	 * Method toString to return data in string format
	 * @return data in string format
	 */
	public String toString() {
		String s = super.getReceipt() + "\n";
		s += "Sub-Total: $" + super.getTotal() + "\n";
		s += "Discount: $" + super.valueToString(getDiscountAmount()) + "\n";
		s += "Number of discounted items: " + discountCount + "\n";
		s += "Discount percent: " + super.valueToString(getDiscountPercent()) + "%\n";
		s += "Total: $" + super.valueToString(getTotal());
		return s;
	}
	
}
