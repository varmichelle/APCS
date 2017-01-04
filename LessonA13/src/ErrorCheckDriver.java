
public class ErrorCheckDriver {

	public static void main(String[] args) {
		
		try {
			// create account with negative balance
			ErrorCheck acc1 = new ErrorCheck(-100, 100);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
			try {
				// create account with positive balance
				ErrorCheck acc2 = new ErrorCheck(100, 100);
				// deposit a negative amount
				acc2.deposit(-100);
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
				try {
					// create account with positive balance
					ErrorCheck acc3 = new ErrorCheck(100, 100);
					// overdraw
					acc3.withdraw(200);
				} catch (Exception e3) {
					System.out.println(e3.getMessage());
				}
			}
		}

	}

}
