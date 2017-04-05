/**
 * 
 * Class RegularCustomer - simulates a customer without a membership
 * @author michelle
 *
 */
public class RegularCustomer extends Customer {

	/**
	 * Constructor to initialize name, member status and type, and service discount rate
	 * @param n - name
	 */
	public RegularCustomer(String n) {
		super(n);
		setMember(false);
		setMemberType("Not a member");
		setServiceDiscountRate(0);
	}
	
}
