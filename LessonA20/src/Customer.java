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
	
	/**
	 * Constructor to initialize name
	 * @param n - name
	 */
	public Customer(String n) {
		name = n;
	}
	
	/**
	 * Get name
	 * @return name - name of member
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Check if customer is a member
	 * @return member - is member or not
	 */
	public boolean isMember() {
		return member;
	}
	
	/**
	 * Set member status
	 * @param status - member status
	 */
	public void setMember(boolean status) {
		member = status;
	}
	
	/**
	 * Get member type
	 * @return memberType - type of membership
	 */
	public String getMemberType() {
		return memberType;
	}
	
	/**
	 * Set member type
	 * @param type - memberType
	 */
	public void setMemberType(String type) {
		memberType = type;
	}
	
	/**
	 * Get product discount rate
	 * @return PRODUCT_DISCOUNT_RATE - product discount rate (decimal)
	 */
	public double getProductDiscountRate() {
		return PRODUCT_DISCOUNT_RATE;
	}
	
	/**
	 * Get product discount
	 * @param price - price of product
	 * @return discountedPrice - product discount price
	 */
	public double getProductDiscount(double price) {
		return price * getProductDiscountRate();
	}
	
	/**
	 * Get service discount rate
	 * @return serviceDiscountRate - service discount rate (decimal)
	 */
	public double getServiceDiscountRate() {
		return serviceDiscountRate;
	}
	
	/**
	 * Get service discount
	 * @param price - price of service
	 * @return discountedPrice - service discount price
	 */
	public double getServiceDiscount(double price) {
		return price * getServiceDiscountRate();
	}
	
	/**
	 * Set service discount rate
	 * @param rate - service discount rate
	 */
	public void setServiceDiscountRate(double rate) {
		serviceDiscountRate = rate;
	}
	
	/**
	 * Return data in string format
	 * @return data in string form
	 */
	public String toString() {
		return "customer: " + getName() + "\nMembership type: " + getMemberType() + "\n";
	}
	
}
