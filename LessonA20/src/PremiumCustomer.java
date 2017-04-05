/**
 * 
 * Class PremiumCustomer - simulates a customer with premium membership
 * @author Michelle Li
 * Period 1
 *
 */

public class PremiumCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.2;
	
	/**
	 * Constructor to initialize name, member status and type, and service discount rate
	 * @param n - name
	 */
	public PremiumCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Premium");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}

}
