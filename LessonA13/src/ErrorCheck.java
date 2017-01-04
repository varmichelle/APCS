
public class ErrorCheck {

	private double myBalance;
	private int myAccountNumber;
	
	public ErrorCheck() {
		myBalance = 0;
		myAccountNumber = 0;
	}
	
	public ErrorCheck(double initialBalance, int acctNum) {
		myBalance = initialBalance;
		myAccountNumber = acctNum;
	}
	
	public double getBalance() {
		return myBalance;
	}
	
	public void deposit(double amount) {
		myBalance += amount;
	}
	
	public void withdraw(double amount) {
		myBalance -= amount;
	}

}
