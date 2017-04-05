import java.util.Date;

public class Visit {
	
	private Customer customer;
	private Date date;
	private double serviceExpense; // expense after discount
	private double productExpense; // expense after discount
	
	public Visit(Customer c, Date d, double sExpense, double pExpense) {
		customer = c;
		date = d;
		serviceExpense = sExpense - customer.getServiceDiscount(sExpense);
		productExpense = pExpense - customer.getProductDiscount(pExpense);
	}
	
	public void setServiceExpense(double sExpense) {
		serviceExpense = sExpense - customer.getServiceDiscount(sExpense);
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setProductExpense(double pExpense) {
		productExpense = pExpense - customer.getProductDiscount(pExpense);
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public double getTotalExpense() {
		return getProductExpense() + getServiceExpense();
	}
	
	public Date getDate() {
		return date;
	}
	
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
