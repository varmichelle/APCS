
public class GoldCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.15;
	
	public GoldCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Gold");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}

}
