
public class PremiumCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.2;
	
	public PremiumCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Premium");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}

}
