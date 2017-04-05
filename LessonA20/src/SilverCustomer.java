
public class SilverCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.1;
	
	public SilverCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Silver");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}
	
}
