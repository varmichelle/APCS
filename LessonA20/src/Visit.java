import java.util.Date;

public class Visit {
	
	private Customer customer;
	private Date date;
	private double serviceExpense; // expense after discount
	private double productExpense; // expense after discount
	
	/**
	 * Constructor to initialize fields
	 * @param c - customer
	 * @param d - date
	 * @param sExpense - service expense
	 * @param pExpense - product expense
	 */
	public Visit(Customer c, Date d, double sExpense, double pExpense) {
		customer = c;
		date = d;
		serviceExpense = sExpense - customer.getServiceDiscount(sExpense);
		productExpense = pExpense - customer.getProductDiscount(pExpense);
	}
	
	/**
	 * Set service expense
	 * @param sExpense - service expense
	 */
	public void setServiceExpense(double sExpense) {
		serviceExpense = sExpense - customer.getServiceDiscount(sExpense);
	}
	
	/**
	 * Get service expense 
	 * @return serviceExpense - service expense
	 */
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	/**
	 * Set product expense
	 * @param pExpense - product expense
	 */
	public void setProductExpense(double pExpense) {
		productExpense = pExpense - customer.getProductDiscount(pExpense);
	}
	
	/**
	 * Get product expense
	 * @return productExpense - product expense
	 */
	public double getProductExpense() {
		return productExpense;
	}
	
	/**
	 * Get total expense
	 * @return totalExpense - total expense (service + product)
	 */
	public double getTotalExpense() {
		return getProductExpense() + getServiceExpense();
	}
	
	/**
	 * Get date of transaction
	 * @return date - date of transaction
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * Return data in string form
	 * @return data in string form
	 */
	public String toString() {
		String s = "Date: " + getDate() + "\n";
		s += "Invoice for " + customer.toString();
		s += String.format("Service charge (with %.1f", customer.getServiceDiscountRate()*100);
		s += "% discount): $";
		s += String.format("%.2f\n", getServiceExpense());
		s += String.format("Product charge (with %.1f", customer.getProductDiscountRate()*100);
		s += "% discount): $";
		s += String.format("%.2f\n", getProductExpense());
		s += String.format("Total: $%.2f\n", getTotalExpense());
		return s;
	}
	
}
