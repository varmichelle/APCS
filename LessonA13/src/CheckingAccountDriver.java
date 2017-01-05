/**
 * Class CheckingAccountDriver to test CheckingAccount class
 * @author Michelle Li
 * Period 1
 *
 */
public class CheckingAccountDriver {

	public static void main(String[] args) {
		
		try {
			// create account with negative balance
			CheckingAccount acc1 = new CheckingAccount(-100, 100);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			try {
				// create account with positive balance
				CheckingAccount acc2 = new CheckingAccount(100, 100);
				// deposit a negative amount
				acc2.deposit(-100);
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				try {
					// create account with positive balance
					CheckingAccount acc3 = new CheckingAccount(100, 100);
					// overdraw
					acc3.withdraw(200);
				} catch (Exception e3) {
					System.out.println(e3.getMessage());
				}
			}
		}

	}

}
