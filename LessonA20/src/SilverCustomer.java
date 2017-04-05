/**
 * 
 * Class SilverCustomer - simulates a customer with silver membership
 * @author michelle
 *
 */
public class SilverCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.1;
	
	/**
	 * Constructor to initialize name, member status and type, and service discount rate
	 * @param n - name
	 */
	public SilverCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Silver");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}
	
}
