/**
 * 
 * Class GoldCustomer - simulates a customer with gold membership
 * @author Michelle Li
 * Period 1
 *
 */
public class GoldCustomer extends Customer {

	private final double SERVICE_DISCOUNT_RATE = 0.15;
	
	/**
	 * Constructor to initialize name, member status and type, and service discount rate
	 * @param n - name
	 */
	public GoldCustomer(String n) {
		super(n);
		setMember(true);
		setMemberType("Gold");
		setServiceDiscountRate(SERVICE_DISCOUNT_RATE);
	}

}
