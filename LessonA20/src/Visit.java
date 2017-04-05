import java.util.Date;

public class Visit {
	
	private Customer customer;
	private Date date;
	private double serviceExpense; // expense after discount
	private double productExpense; // expense after discount
	
	public Visit(Customer c, Date d, double sExpense, double pExpense) {
		customer = c;
		date = d;
		serviceExpense = sExpense;
		productExpense = pExpense;
	}
	
	public void setServiceExpense(double sExpense) {
		serviceExpense = sExpense;
	}
	
	public double getServiceExpense() {
		return serviceExpense;
	}
	
	public void setProductExpense(double pExpense) {
		productExpense = pExpense;
	}
	
	public double getProductExpense() {
		return productExpense;
	}
	
	public double getTotalExpense() {
		return getProductExpense() + getServiceExpense();
	}
	
	public String toString() {
		return "";
	}
	
}
