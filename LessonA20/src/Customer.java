/**
 * 
 * Class Customer - simulates a sales customer
 * @author Michelle Li
 * Period 1
 *
 */

public abstract class Customer {
	
	private String name;
	private boolean member;
	private String memberType = "";
	private final double PRODUCT_DISCOUNT_RATE = 0.1;
	private double serviceDiscountRate;
	
	public Customer(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isMember() {
		return member;
	}
	
	public void setMember(boolean status) {
		member = status;
	}
	
	public String getMemberType() {
		return memberType;
	}
	
	public void setMemberType(String type) {
		memberType = type;
	}
	
	public double getProductDiscountRate() {
		return PRODUCT_DISCOUNT_RATE;
	}
	
	public double getProductDiscount(double price) {
		return price * getProductDiscountRate();
	}
	
	public double getServiceDiscountRate() {
		return serviceDiscountRate;
	}
	
	public double getServiceDiscount(double price) {
		return price * getServiceDiscountRate();
	}
	
	public void setServiceDiscountRate(double rate) {
		serviceDiscountRate = rate;
	}
	
	public String toString() {
		return getName() + "\n" + getMemberType();
	}
	
}
