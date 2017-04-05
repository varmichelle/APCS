
public class RegularCustomer extends Customer {

	public RegularCustomer(String n) {
		super(n);
		setMember(false);
		setMemberType("Not a member");
		setServiceDiscountRate(0);
	}
	
}
